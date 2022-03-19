/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Metric.
 */
@JsonInclude(Include.NON_NULL)
public class Metric {

    /** The amount. */
    @SerializedName("amount")
    @Expose
    private double amount;
    
    /** The unit short. */
    @SerializedName("unitShort")
    @Expose
    private String unitShort;
    
    /** The unit long. */
    @SerializedName("unitLong")
    @Expose
    private String unitLong;

    /**
     * Instantiates a new metric.
     */
    public Metric() {
    }

    /**
     * Instantiates a new metric.
     *
     * @param amount the amount
     * @param unitShort the unit short
     * @param unitLong the unit long
     */
    public Metric(double amount, String unitShort, String unitLong) {
        super();
        this.amount = amount;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
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

}
