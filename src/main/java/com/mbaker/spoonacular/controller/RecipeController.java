/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbaker.spoonacular.beans.RecipeInformation;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.service.RecipeService;

/**
 * The Class RecipeController.
 */
@RestController
@RequestMapping("/recipes")
public class RecipeController extends SpoonacularExceptionHandler {

	/** The recipe service. */
	@Autowired
	private RecipeService recipeService;

	/**
	 * Search.
	 *
	 * @param query the query
	 * @return the response entity
	 * @throws SpoonacularException the spoonacular exception
	 */
	@GetMapping("/search")
	public ResponseEntity<RecipeSearchResult> search(@RequestParam(name = "query", required = false) String query)
			throws SpoonacularException {
		RecipeSearchParams params = new RecipeSearchParams();
		params.setQuery(query);
		Optional<RecipeSearchResult> search = getRecipeService().search(params);
		if (search.isPresent()) {
			return new ResponseEntity<>(search.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Gets the recipe information.
	 *
	 * @param id the id
	 * @return the recipe information
	 * @throws SpoonacularException the spoonacular exception
	 */
	@GetMapping("/{id}")
	public ResponseEntity<RecipeInformation> getRecipeInformation(@PathVariable(name = "id", required = true) String id)
			throws SpoonacularException {
		Optional<RecipeInformation> recipe = getRecipeService().getRecipeInformation(id);
		if (recipe.isPresent()) {
			return new ResponseEntity<>(recipe.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	/**
	 * Gets the calories.
	 *
	 * @param id the id
	 * @param ingredents the ingredents
	 * @return the calories
	 * @throws SpoonacularException the spoonacular exception
	 */
	@GetMapping(path = "/{id}/calroies")
	public ResponseEntity<Double> getCalories(@PathVariable(name = "id", required = true) String id,
			@RequestParam(name = "ingredents") List<String> ingredents) throws SpoonacularException {
		double calories = getRecipeService().getRecipeCaloriesWithoutIngrediants(id, ingredents);
		return new ResponseEntity<>(calories, HttpStatus.OK);
	}

	/**
	 * Gets the recipe service.
	 *
	 * @return the recipe service
	 */
	protected RecipeService getRecipeService() {
		return recipeService;
	}

}
