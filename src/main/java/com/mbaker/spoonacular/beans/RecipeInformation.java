/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.beans;

/**
 * The Class RecipeInformation.
 */
public class RecipeInformation {

	/** The recipe. */
	private Recipe recipe;

	/** The total calories. */
	private double totalCalories;

	/**
	 * Instantiates a new recipe information.
	 *
	 * @param recipe the recipe
	 * @param totalCalories the total calories
	 */
	public RecipeInformation(Recipe recipe, double totalCalories) {
		super();
		this.recipe = recipe;
		this.totalCalories = totalCalories;
	}

	/**
	 * Gets the recipe.
	 *
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}

	/**
	 * Sets the recipe.
	 *
	 * @param recipe the new recipe
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	/**
	 * Gets the total calories.
	 *
	 * @return the total calories
	 */
	public double getTotalCalories() {
		return totalCalories;
	}

	/**
	 * Sets the total calories.
	 *
	 * @param totalCalories the new total calories
	 */
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}

}
