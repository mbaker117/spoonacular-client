/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Property.
 */
@Generated("jsonschema2pojo")
public class Property {

    /** The name. */
    @SerializedName("name")
    @Expose
    private String name;
    
    /** The amount. */
    @SerializedName("amount")
    @Expose
    private double amount;
    
    /** The unit. */
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * Instantiates a new property.
     */
    public Property() {
    }

    /**
     * Instantiates a new property.
     *
     * @param name the name
     * @param amount the amount
     * @param unit the unit
     */
    public Property(String name, double amount, String unit) {
        super();
        this.name = name;
        this.amount = amount;
        this.unit = unit;
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

}
