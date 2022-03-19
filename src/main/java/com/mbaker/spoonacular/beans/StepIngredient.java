/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class StepIngredient.
 */
@JsonInclude(Include.NON_NULL)
public class StepIngredient {

    /** The id. */
    @SerializedName("id")
    @Expose
    private int id;
    
    /** The name. */
    @SerializedName("name")
    @Expose
    private String name;
    
    /** The localized name. */
    @SerializedName("localizedName")
    @Expose
    private String localizedName;
    
    /** The image. */
    @SerializedName("image")
    @Expose
    private String image;

    /**
     * Instantiates a new step ingredient.
     */
    public StepIngredient() {
    }

    /**
     * Instantiates a new step ingredient.
     *
     * @param id the id
     * @param name the name
     * @param localizedName the localized name
     * @param image the image
     */
    public StepIngredient(int id, String name, String localizedName, String image) {
        super();
        this.id = id;
        this.name = name;
        this.localizedName = localizedName;
        this.image = image;
    }

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
     * Gets the localized name.
     *
     * @return the localized name
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * Sets the localized name.
     *
     * @param localizedName the new localized name
     */
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
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

}
