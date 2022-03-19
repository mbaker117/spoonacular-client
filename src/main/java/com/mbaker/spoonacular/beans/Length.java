/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Length.
 */
@JsonInclude(Include.NON_NULL)
public class Length {

    /** The number. */
    @SerializedName("number")
    @Expose
    private int number;
    
    /** The unit. */
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * Instantiates a new length.
     */
    public Length() {
    }

    /**
     * Instantiates a new length.
     *
     * @param number the number
     * @param unit the unit
     */
    public Length(int number, String unit) {
        super();
        this.number = number;
        this.unit = unit;
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
