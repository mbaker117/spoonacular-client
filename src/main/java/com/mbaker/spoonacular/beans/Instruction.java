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
 * The Class Instruction.
 */
@JsonInclude(Include.NON_NULL)
public class Instruction {

    /** The name. */
    @SerializedName("name")
    @Expose
    private String name;
    
    /** The steps. */
    @SerializedName("steps")
    @Expose
    private List<Step> steps = null;

    /**
     * Instantiates a new instruction.
     */
    public Instruction() {
    }

    /**
     * Instantiates a new instruction.
     *
     * @param name the name
     * @param steps the steps
     */
    public Instruction(String name, List<Step> steps) {
        super();
        this.name = name;
        this.steps = steps;
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
     * Gets the steps.
     *
     * @return the steps
     */
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * Sets the steps.
     *
     * @param steps the new steps
     */
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

}
