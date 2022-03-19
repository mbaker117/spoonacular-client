package com.mbaker.spoonacular.service;

import java.util.Optional;

import com.mbaker.spoonacular.beans.Recipe;
import com.mbaker.spoonacular.beans.RecipeInformationParams;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.exception.SpoonacularException;

public interface SpoonacularRecipeClientService {

	public Optional<RecipeSearchResult> search(String baseUrl,String apiKey, RecipeSearchParams recipeSearchParams) throws SpoonacularException;

	public Optional<Recipe> getRecipeInformation(String baseUrl,String apiKey, RecipeInformationParams recipeInformation) throws SpoonacularException;
}
