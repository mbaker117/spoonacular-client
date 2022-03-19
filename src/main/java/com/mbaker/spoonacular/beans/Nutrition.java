/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Nutrition.
 */
public class Nutrition {

	/** The nutrients. */
	@SerializedName("nutrients")
	@Expose
	private List<Nutrient> nutrients = null;
	
	/** The properties. */
	@SerializedName("properties")
	@Expose
	private List<Property> properties = null;
	
	/** The flavonoids. */
	@SerializedName("flavonoids")
	@Expose
	private List<Flavonoid> flavonoids = null;
	
	/** The ingredients. */
	@SerializedName("ingredients")
	@Expose
	private List<Ingredient> ingredients = null;
	
	/** The caloric breakdown. */
	@SerializedName("caloricBreakdown")
	@Expose
	private CaloricBreakdown caloricBreakdown;
	
	/** The weight per serving. */
	@SerializedName("weightPerServing")
	@Expose
	private WeightPerServing weightPerServing;

	/**
	 * Gets the nutrients.
	 *
	 * @return the nutrients
	 */
	public List<Nutrient> getNutrients() {
		return nutrients;
	}

	/**
	 * Sets the nutrients.
	 *
	 * @param nutrients the new nutrients
	 */
	public void setNutrients(List<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public List<Property> getProperties() {
		return properties;
	}

	/**
	 * Sets the properties.
	 *
	 * @param properties the new properties
	 */
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	/**
	 * Gets the flavonoids.
	 *
	 * @return the flavonoids
	 */
	public List<Flavonoid> getFlavonoids() {
		return flavonoids;
	}

	/**
	 * Sets the flavonoids.
	 *
	 * @param flavonoids the new flavonoids
	 */
	public void setFlavonoids(List<Flavonoid> flavonoids) {
		this.flavonoids = flavonoids;
	}

	/**
	 * Gets the ingredients.
	 *
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Sets the ingredients.
	 *
	 * @param ingredients the new ingredients
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Gets the caloric breakdown.
	 *
	 * @return the caloric breakdown
	 */
	public CaloricBreakdown getCaloricBreakdown() {
		return caloricBreakdown;
	}

	/**
	 * Sets the caloric breakdown.
	 *
	 * @param caloricBreakdown the new caloric breakdown
	 */
	public void setCaloricBreakdown(CaloricBreakdown caloricBreakdown) {
		this.caloricBreakdown = caloricBreakdown;
	}

	/**
	 * Gets the weight per serving.
	 *
	 * @return the weight per serving
	 */
	public WeightPerServing getWeightPerServing() {
		return weightPerServing;
	}

	/**
	 * Sets the weight per serving.
	 *
	 * @param weightPerServing the new weight per serving
	 */
	public void setWeightPerServing(WeightPerServing weightPerServing) {
		this.weightPerServing = weightPerServing;
	}

}
