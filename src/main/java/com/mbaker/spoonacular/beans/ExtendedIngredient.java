/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class ExtendedIngredient.
 */
@JsonInclude(Include.NON_NULL)
public class ExtendedIngredient extends Ingredient {

	/** The consistency. */
	@SerializedName("consistency")
	@Expose
	private String consistency;
	
	/** The name clean. */
	@SerializedName("nameClean")
	@Expose
	private String nameClean;

	/** The measures. */
	@SerializedName("measures")
	@Expose
	private Measure measures;

	/**
	 * Instantiates a new extended ingredient.
	 */
	public ExtendedIngredient() {
		super();
	}

	/**
	 * Gets the consistency.
	 *
	 * @return the consistency
	 */
	public String getConsistency() {
		return consistency;
	}

	/**
	 * Sets the consistency.
	 *
	 * @param consistency the new consistency
	 */
	public void setConsistency(String consistency) {
		this.consistency = consistency;
	}

	/**
	 * Gets the name clean.
	 *
	 * @return the name clean
	 */
	public String getNameClean() {
		return nameClean;
	}

	/**
	 * Sets the name clean.
	 *
	 * @param nameClean the new name clean
	 */
	public void setNameClean(String nameClean) {
		this.nameClean = nameClean;
	}

	/**
	 * Gets the measures.
	 *
	 * @return the measures
	 */
	public Measure getMeasures() {
		return measures;
	}

	/**
	 * Sets the measures.
	 *
	 * @param measures the new measures
	 */
	public void setMeasures(Measure measures) {
		this.measures = measures;
	}
}
