/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class MissedIngredient.
 */
@JsonInclude(Include.NON_NULL)
public class MissedIngredient extends Ingredient {

	/** The unit long. */
	@SerializedName("unitLong")
	@Expose
	private String unitLong;
	
	/** The unit short. */
	@SerializedName("unitShort")
	@Expose
	private String unitShort;

	/** The extended name. */
	@SerializedName("extendedName")
	@Expose
	private String extendedName;

	/**
	 * Instantiates a new missed ingredient.
	 */
	public MissedIngredient() {

	}

	/**
	 * Instantiates a new missed ingredient.
	 *
	 * @param unitLong the unit long
	 * @param unitShort the unit short
	 * @param extendedName the extended name
	 */
	public MissedIngredient(String unitLong, String unitShort, String extendedName) {
		super();
		this.unitLong = unitLong;
		this.unitShort = unitShort;
		this.extendedName = extendedName;
	}

	/**
	 * Gets the unit long.
	 *
	 * @return the unit long
	 */
	public String getUnitLong() {
		return unitLong;
	}

	/**
	 * Sets the unit long.
	 *
	 * @param unitLong the new unit long
	 */
	public void setUnitLong(String unitLong) {
		this.unitLong = unitLong;
	}

	/**
	 * Gets the unit short.
	 *
	 * @return the unit short
	 */
	public String getUnitShort() {
		return unitShort;
	}

	/**
	 * Sets the unit short.
	 *
	 * @param unitShort the new unit short
	 */
	public void setUnitShort(String unitShort) {
		this.unitShort = unitShort;
	}

	/**
	 * Gets the extended name.
	 *
	 * @return the extended name
	 */
	public String getExtendedName() {
		return extendedName;
	}

	/**
	 * Sets the extended name.
	 *
	 * @param extendedName the new extended name
	 */
	public void setExtendedName(String extendedName) {
		this.extendedName = extendedName;
	}

}
