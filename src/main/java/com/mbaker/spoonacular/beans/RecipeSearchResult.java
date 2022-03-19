/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class RecipeSearchResult.
 */
@JsonInclude(Include.NON_NULL)
public class RecipeSearchResult {

	/** The results. */
	@SerializedName("results")
	@Expose
	private List<Recipe> results;

	/** The offset. */
	@SerializedName("offset")
	@Expose
	private int offset;

	/** The number. */
	@SerializedName("number")
	@Expose
	private int number;

	/** The total result. */
	@SerializedName("totalResult")
	@Expose
	private int totalResult;

	/**
	 * Instantiates a new recipe search result.
	 */
	public RecipeSearchResult() {
		super();
	}

	/**
	 * Instantiates a new recipe search result.
	 *
	 * @param results the results
	 * @param offset the offset
	 * @param number the number
	 * @param totalResult the total result
	 */
	public RecipeSearchResult(List<Recipe> results, int offset, int number, int totalResult) {
		super();
		this.results = results;
		this.offset = offset;
		this.number = number;
		this.totalResult = totalResult;
	}

	/**
	 * Gets the results.
	 *
	 * @return the results
	 */
	public List<Recipe> getResults() {
		return results;
	}

	/**
	 * Sets the results.
	 *
	 * @param results the new results
	 */
	public void setResults(List<Recipe> results) {
		this.results = results;
	}

	/**
	 * Gets the offset.
	 *
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset the new offset
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Gets the total result.
	 *
	 * @return the total result
	 */
	public int getTotalResult() {
		return totalResult;
	}

	/**
	 * Sets the total result.
	 *
	 * @param totalResult the new total result
	 */
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
}
