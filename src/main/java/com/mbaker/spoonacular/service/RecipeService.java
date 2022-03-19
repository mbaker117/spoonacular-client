package com.mbaker.spoonacular.service;

import java.util.List;
import java.util.Optional;

import com.mbaker.spoonacular.beans.RecipeInformation;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.exception.SpoonacularException;

public interface RecipeService {
	
	public Optional<RecipeSearchResult> search(RecipeSearchParams recipeSearchParams) throws SpoonacularException;
	
	public Optional<RecipeInformation> getRecipeInformation(String id) throws SpoonacularException;
	
	double getRecipeCaloriesWithoutIngrediants(String id, List<String> ingrediants) throws SpoonacularException;

}
