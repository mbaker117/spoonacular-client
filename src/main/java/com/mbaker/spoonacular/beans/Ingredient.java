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
 * The Class Ingredient.
 */
@JsonInclude(Include.NON_NULL)
public class Ingredient {

	/** The id. */
	@SerializedName("id")
	@Expose
	private int id;
	
	/** The aisle. */
	@SerializedName("aisle")
	@Expose
	private String aisle;
	
	/** The image. */
	@SerializedName("image")
	@Expose
	private String image;
	
	/** The name. */
	@SerializedName("name")
	@Expose
	private String name;

	/** The original. */
	@SerializedName("original")
	@Expose
	private String original;
	
	/** The original name. */
	@SerializedName("originalName")
	@Expose
	private String originalName;
	
	/** The amount. */
	@SerializedName("amount")
	@Expose
	private double amount;
	
	/** The unit. */
	@SerializedName("unit")
	@Expose
	private String unit;
	
	/** The meta. */
	@SerializedName("meta")
	@Expose
	private List<String> meta = null;

	/** The nutrients. */
	@SerializedName("nutrients")
	@Expose
	private List<Nutrient> nutrients = null;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the aisle.
	 *
	 * @return the aisle
	 */
	public String getAisle() {
		return aisle;
	}

	/**
	 * Sets the aisle.
	 *
	 * @param aisle the new aisle
	 */
	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(String image) {
		this.image = image;
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
	 * Gets the original.
	 *
	 * @return the original
	 */
	public String getOriginal() {
		return original;
	}

	/**
	 * Sets the original.
	 *
	 * @param original the new original
	 */
	public void setOriginal(String original) {
		this.original = original;
	}

	/**
	 * Gets the original name.
	 *
	 * @return the original name
	 */
	public String getOriginalName() {
		return originalName;
	}

	/**
	 * Sets the original name.
	 *
	 * @param originalName the new original name
	 */
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(double amount) {
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
	 * Gets the meta.
	 *
	 * @return the meta
	 */
	public List<String> getMeta() {
		return meta;
	}

	/**
	 * Sets the meta.
	 *
	 * @param meta the new meta
	 */
	public void setMeta(List<String> meta) {
		this.meta = meta;
	}

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

}
