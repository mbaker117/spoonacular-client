package com.mbaker.spoonacular.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbaker.spoonacular.beans.Recipe;
import com.mbaker.spoonacular.beans.RecipeInformationParams;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.service.SpoonacularRecipeClientService;

@RestController
@RequestMapping("/spoonacula-recipes")
public class SpoonacularRecipeController extends SpoonacularExceptionHandler {

	@Autowired
	private SpoonacularRecipeClientService spoonacularRecipeService;

	@GetMapping("/search")
	public ResponseEntity<RecipeSearchResult> search(@RequestParam(name = "baseUrl", required = true) String baseUrl,
			@RequestParam(name = "apiKey", required = true) String apiKey,
			@RequestParam(name = "query", required = false) String query) throws SpoonacularException {
		RecipeSearchParams params = new RecipeSearchParams();
		params.setQuery(query);
		Optional<RecipeSearchResult> search = getSpoonacularRecipeService().search(baseUrl, apiKey, params);

		if (search.isPresent()) {
			return new ResponseEntity<>(search.get(), HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Recipe> getRecipeInformation(@RequestParam(name = "baseUrl", required = true) String baseUrl,
			@RequestParam(name = "apiKey", required = true) String apiKey, @PathVariable(name = "id") String id,
			@RequestParam(name = "includeNutrition", required = false) boolean includeNutrition)
			throws SpoonacularException {
		RecipeInformationParams recipeInformation = new RecipeInformationParams(id, includeNutrition);

		Optional<Recipe> recipe = getSpoonacularRecipeService().getRecipeInformation(baseUrl, apiKey,
				recipeInformation);

		if (recipe.isPresent()) {
			return new ResponseEntity<>(recipe.get(), HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	protected SpoonacularRecipeClientService getSpoonacularRecipeService() {
		return spoonacularRecipeService;
	}

}
