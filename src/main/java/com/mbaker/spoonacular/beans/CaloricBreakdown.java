/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class CaloricBreakdown.
 */
@JsonInclude(Include.NON_NULL)
public class CaloricBreakdown {

    /** The percent protein. */
    @SerializedName("percentProtein")
    @Expose
    private double percentProtein;
    
    /** The percent fat. */
    @SerializedName("percentFat")
    @Expose
    private double percentFat;
    
    /** The percent carbs. */
    @SerializedName("percentCarbs")
    @Expose
    private double percentCarbs;

    /**
     * Instantiates a new caloric breakdown.
     */
    public CaloricBreakdown() {
    }

    /**
     * Instantiates a new caloric breakdown.
     *
     * @param percentProtein the percent protein
     * @param percentFat the percent fat
     * @param percentCarbs the percent carbs
     */
    public CaloricBreakdown(double percentProtein, double percentFat, double percentCarbs) {
        super();
        this.percentProtein = percentProtein;
        this.percentFat = percentFat;
        this.percentCarbs = percentCarbs;
    }

    /**
     * Gets the percent protein.
     *
     * @return the percent protein
     */
    public double getPercentProtein() {
        return percentProtein;
    }

    /**
     * Sets the percent protein.
     *
     * @param percentProtein the new percent protein
     */
    public void setPercentProtein(double percentProtein) {
        this.percentProtein = percentProtein;
    }

    /**
     * Gets the percent fat.
     *
     * @return the percent fat
     */
    public double getPercentFat() {
        return percentFat;
    }

    /**
     * Sets the percent fat.
     *
     * @param percentFat the new percent fat
     */
    public void setPercentFat(double percentFat) {
        this.percentFat = percentFat;
    }

    /**
     * Gets the percent carbs.
     *
     * @return the percent carbs
     */
    public double getPercentCarbs() {
        return percentCarbs;
    }

    /**
     * Sets the percent carbs.
     *
     * @param percentCarbs the new percent carbs
     */
    public void setPercentCarbs(double percentCarbs) {
        this.percentCarbs = percentCarbs;
    }

}
