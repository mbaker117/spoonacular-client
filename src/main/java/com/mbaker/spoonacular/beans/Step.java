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
 * The Class Step.
 */
@JsonInclude(Include.NON_NULL)
public class Step {

    /** The number. */
    @SerializedName("number")
    @Expose
    private int number;
    
    /** The step. */
    @SerializedName("step")
    @Expose
    private String step;
    
    /** The ingredients. */
    @SerializedName("ingredients")
    @Expose
    private List<StepIngredient> ingredients = null;
    
    /** The equipment. */
    @SerializedName("equipment")
    @Expose
    private List<Equipment> equipment = null;
    
    /** The length. */
    @SerializedName("length")
    @Expose
    private Length length;

    /**
     * Instantiates a new step.
     */
    public Step() {
    }

    /**
     * Instantiates a new step.
     *
     * @param number the number
     * @param step the step
     * @param ingredients the ingredients
     * @param equipment the equipment
     * @param length the length
     */
    public Step(int number, String step, List<StepIngredient> ingredients, List<Equipment> equipment, Length length) {
        super();
        this.number = number;
        this.step = step;
        this.ingredients = ingredients;
        this.equipment = equipment;
        this.length = length;
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
     * Gets the step.
     *
     * @return the step
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the step.
     *
     * @param step the new step
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * Gets the ingredients.
     *
     * @return the ingredients
     */
    public List<StepIngredient> getIngredients() {
        return ingredients;
    }

    /**
     * Sets the ingredients.
     *
     * @param ingredients the new ingredients
     */
    public void setIngredients(List<StepIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Gets the equipment.
     *
     * @return the equipment
     */
    public List<Equipment> getEquipment() {
        return equipment;
    }

    /**
     * Sets the equipment.
     *
     * @param equipment the new equipment
     */
    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    /**
     * Gets the length.
     *
     * @return the length
     */
    public Length getLength() {
        return length;
    }

    /**
     * Sets the length.
     *
     * @param length the new length
     */
    public void setLength(Length length) {
        this.length = length;
    }

}
