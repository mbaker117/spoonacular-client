/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class WeightPerServing.
 */
@Generated("jsonschema2pojo")
public class WeightPerServing {

    /** The amount. */
    @SerializedName("amount")
    @Expose
    private int amount;
    
    /** The unit. */
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * Instantiates a new weight per serving.
     */
    public WeightPerServing() {
    }

    /**
     * Instantiates a new weight per serving.
     *
     * @param amount the amount
     * @param unit the unit
     */
    public WeightPerServing(int amount, String unit) {
        super();
        this.amount = amount;
        this.unit = unit;
    }

    /**
     * Gets the amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount the new amount
     */
    public void setAmount(int amount) {
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
