/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.beans;

/**
 * The Class RecipeInformationParams.
 */
public class RecipeInformationParams {

	/** The id. */
	private String id;

	/** The include nutrition. */
	private boolean includeNutrition;

	/**
	 * Instantiates a new recipe information params.
	 */
	public RecipeInformationParams() {
		super();
	}

	/**
	 * Instantiates a new recipe information params.
	 *
	 * @param id the id
	 * @param includeNutrition the include nutrition
	 */
	public RecipeInformationParams(String id, boolean includeNutrition) {
		super();
		this.id = id;
		this.includeNutrition = includeNutrition;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Checks if is include nutrition.
	 *
	 * @return true, if is include nutrition
	 */
	public boolean isIncludeNutrition() {
		return includeNutrition;
	}

	/**
	 * Sets the include nutrition.
	 *
	 * @param includeNutrition the new include nutrition
	 */
	public void setIncludeNutrition(boolean includeNutrition) {
		this.includeNutrition = includeNutrition;
	}

}
