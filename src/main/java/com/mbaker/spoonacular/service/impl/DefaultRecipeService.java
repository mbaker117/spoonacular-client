package com.mbaker.spoonacular.service.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.common.base.Preconditions;
import com.mbaker.spoonacular.beans.Ingredient;
import com.mbaker.spoonacular.beans.Nutrient;
import com.mbaker.spoonacular.beans.Recipe;
import com.mbaker.spoonacular.beans.RecipeInformation;
import com.mbaker.spoonacular.beans.RecipeInformationParams;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;
import com.mbaker.spoonacular.service.RecipeService;
import com.mbaker.spoonacular.service.SpoonacularRecipeClientService;

@Service
public class DefaultRecipeService implements RecipeService {

	private static final String RECIPE_NOT_FOUND_MSG = "no recipe with id {} exists";

	private static final String ID_EMPTY_MSG = "id is empty";

	private static final String CALORIES_KEY = "Calories";

	private static final Logger LOG = LoggerFactory.getLogger(DefaultRecipeService.class);

	@Autowired
	private Environment environment;

	@Autowired
	private SpoonacularRecipeClientService recipeClientService;

	@Override
	public Optional<RecipeSearchResult> search(RecipeSearchParams recipeSearchParams) throws SpoonacularException {
		String baseUrl = getBaseUrl();
		String apiKey = getApiKey();
		return getRecipeClientService().search(baseUrl, apiKey, recipeSearchParams);
	}

	@Override
	public Optional<RecipeInformation> getRecipeInformation(String id) throws SpoonacularException {
		Preconditions.checkArgument(Strings.isNotBlank(id), ID_EMPTY_MSG);
		Optional<Recipe> recipe = getRecipe(id, true);
		if (recipe.isEmpty()) {
			LOG.warn(RECIPE_NOT_FOUND_MSG, id);
			throw new SpoonacularException(null, SpoonacularExceptionType.RECIPE_NOT_FOUND,
					SpoonacularExceptionType.RECIPE_NOT_FOUND.getMsg());
		}

		double totalCalories = calculateTotalCalories(recipe.get(), Collections.emptySet());
		RecipeInformation recipeInformation = new RecipeInformation(recipe.get(), totalCalories);
		return Optional.ofNullable(recipeInformation);
	}

	private Optional<Recipe> getRecipe(String id, boolean includeNutrition) throws SpoonacularException {
		String baseUrl = getBaseUrl();
		String apiKey = getApiKey();
		RecipeInformationParams params = getRecipeInformationParams(id, includeNutrition);
		return getRecipeClientService().getRecipeInformation(baseUrl, apiKey, params);
	}

	private double calculateTotalCalories(Recipe recipe, Set<String> excludedIngredients) {
		if (Objects.isNull(recipe.getNutrition()) || CollectionUtils.isEmpty(recipe.getNutrition().getIngredients())) {
			LOG.error("Couldn't calculate total calories due to missing data");
			return 0;
		}
		List<Ingredient> ingredients = recipe.getNutrition().getIngredients().stream()
				.filter(ing -> !excludedIngredients.contains(ing.getName()))
				.filter(ing -> !CollectionUtils.isEmpty(ing.getNutrients())).collect(Collectors.toList());
		double totalCalories = 0.0;
		for (Ingredient ingredient : ingredients) {
			if (CollectionUtils.isEmpty(ingredient.getNutrients())) {
				LOG.warn("no nutrients for ingredient {}", ingredient.getName());
				continue;
			}

			Optional<Nutrient> findFirst = ingredient.getNutrients().stream()
					.filter(nut -> CALORIES_KEY.equalsIgnoreCase(nut.getName())).findFirst();
			if (findFirst.isPresent()) {
				totalCalories += findFirst.get().getAmount();
			}
		}
		return totalCalories;
	}

	@Override
	public double getRecipeCaloriesWithoutIngrediants(String id, List<String> ingrediants) throws SpoonacularException {
		Preconditions.checkArgument(Strings.isNotBlank(id), ID_EMPTY_MSG);
		Optional<Recipe> recipe = getRecipe(id, true);
		if (recipe.isEmpty()) {
			LOG.warn(RECIPE_NOT_FOUND_MSG, id);
			throw new SpoonacularException(null, SpoonacularExceptionType.RECIPE_NOT_FOUND,
					SpoonacularExceptionType.RECIPE_NOT_FOUND.getMsg());
		}
		return calculateTotalCalories(recipe.get(), new HashSet<>(ingrediants));
	}

	protected String getBaseUrl() throws SpoonacularException {
		String baseUrl = getEnvironment().getProperty("spoonacular.baseurl");
		if (Strings.isBlank(baseUrl)) {
			LOG.error(SpoonacularExceptionType.BASE_URL_NOT_EXISTS.getMsg());
			throw new SpoonacularException(null, SpoonacularExceptionType.BASE_URL_NOT_EXISTS,
					SpoonacularExceptionType.BASE_URL_NOT_EXISTS.getMsg());

		}
		return baseUrl;
	}

	protected String getApiKey() throws SpoonacularException {
		String apiKey = getEnvironment().getProperty("spoonacular.apikey");
		if (Strings.isBlank(apiKey)) {
			LOG.error(SpoonacularExceptionType.API_KEY_NOT_EXISTS.getMsg());
			throw new SpoonacularException(null, SpoonacularExceptionType.API_KEY_NOT_EXISTS,
					SpoonacularExceptionType.API_KEY_NOT_EXISTS.getMsg());

		}
		return apiKey;
	}

	protected RecipeInformationParams getRecipeInformationParams(String id, boolean includeNutrition) {
		return new RecipeInformationParams(id, includeNutrition);
	}

	protected Environment getEnvironment() {
		return environment;
	}

	protected SpoonacularRecipeClientService getRecipeClientService() {
		return recipeClientService;
	}

}
