/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Nutrient.
 */
public class Nutrient {

	/** The name. */
	@SerializedName("name")
	@Expose
	private String name;
	
	/** The amount. */
	@SerializedName("amount")
	@Expose
	private Double amount;
	
	/** The unit. */
	@SerializedName("unit")
	@Expose
	private String unit;
	
	/** The percent of daily needs. */
	@SerializedName("percentOfDailyNeeds")
	@Expose
	private Double percentOfDailyNeeds;

	/**
	 * Instantiates a new nutrient.
	 */
	public Nutrient() {
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * Gets the unit.
	 *
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the unit.
	 *
	 * @param unit the new unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Gets the percent of daily needs.
	 *
	 * @return the percent of daily needs
	 */
	public Double getPercentOfDailyNeeds() {
		return percentOfDailyNeeds;
	}

	/**
	 * Sets the percent of daily needs.
	 *
	 * @param percentOfDailyNeeds the new percent of daily needs
	 */
	public void setPercentOfDailyNeeds(Double percentOfDailyNeeds) {
		this.percentOfDailyNeeds = percentOfDailyNeeds;
	}

}
