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
 * The Class Recipe.
 */
@JsonInclude(Include.NON_NULL)
public class Recipe {

	/** The vegetarian. */
	@SerializedName("vegetarian")
	@Expose
	private Boolean vegetarian;
	
	/** The vegan. */
	@SerializedName("vegan")
	@Expose
	private Boolean vegan;
	
	/** The gluten free. */
	@SerializedName("glutenFree")
	@Expose
	private Boolean glutenFree;
	
	/** The dairy free. */
	@SerializedName("dairyFree")
	@Expose
	private Boolean dairyFree;
	
	/** The very healthy. */
	@SerializedName("veryHealthy")
	@Expose
	private Boolean veryHealthy;
	
	/** The cheap. */
	@SerializedName("cheap")
	@Expose
	private Boolean cheap;
	
	/** The very popular. */
	@SerializedName("veryPopular")
	@Expose
	private Boolean veryPopular;
	
	/** The sustainable. */
	@SerializedName("sustainable")
	@Expose
	private Boolean sustainable;
	
	/** The weight watcher smart po integers. */
	@SerializedName("weightWatcherSmartPoIntegers")
	@Expose
	private Integer weightWatcherSmartPoIntegers;
	
	/** The gaps. */
	@SerializedName("gaps")
	@Expose
	private String gaps;
	
	/** The low fodmap. */
	@SerializedName("lowFodmap")
	@Expose
	private Boolean lowFodmap;
	
	/** The aggregate likes. */
	@SerializedName("aggregateLikes")
	@Expose
	private Integer aggregateLikes;
	
	/** The spoonacular score. */
	@SerializedName("spoonacularScore")
	@Expose
	private Double spoonacularScore;
	
	/** The health score. */
	@SerializedName("healthScore")
	@Expose
	private Double healthScore;
	
	/** The credits text. */
	@SerializedName("creditsText")
	@Expose
	private String creditsText;
	
	/** The license. */
	@SerializedName("license")
	@Expose
	private String license;
	
	/** The source name. */
	@SerializedName("sourceName")
	@Expose
	private String sourceName;
	
	/** The price per serving. */
	@SerializedName("pricePerServing")
	@Expose
	private Double pricePerServing;
	
	/** The extended ingredients. */
	@SerializedName("extendedIngredients")
	@Expose
	private List<ExtendedIngredient> extendedIngredients = null;
	
	/** The id. */
	@SerializedName("id")
	@Expose
	private Integer id;
	
	/** The title. */
	@SerializedName("title")
	@Expose
	private String title;
	
	/** The ready in minutes. */
	@SerializedName("readyInMinutes")
	@Expose
	private Integer readyInMinutes;
	
	/** The servings. */
	@SerializedName("servings")
	@Expose
	private Integer servings;
	
	/** The source url. */
	@SerializedName("sourceUrl")
	@Expose
	private String sourceUrl;
	
	/** The image. */
	@SerializedName("image")
	@Expose
	private String image;
	
	/** The image type. */
	@SerializedName("imageType")
	@Expose
	private String imageType;
	
	/** The summary. */
	@SerializedName("summary")
	@Expose
	private String summary;
	
	/** The cuisines. */
	@SerializedName("cuisines")
	@Expose
	private List<String> cuisines = null;
	
	/** The dish types. */
	@SerializedName("dishTypes")
	@Expose
	private List<String> dishTypes = null;
	
	/** The diets. */
	@SerializedName("diets")
	@Expose
	private List<String> diets = null;
	
	/** The occasions. */
	@SerializedName("occasions")
	@Expose
	private List<Object> occasions = null;
	
	/** The analyzed instructions. */
	@SerializedName("analyzedInstructions")
	@Expose
	private List<Instruction> analyzedInstructions = null;
	
	/** The spoonacular source url. */
	@SerializedName("spoonacularSourceUrl")
	@Expose
	private String spoonacularSourceUrl;
	
	/** The used ingredient count. */
	@SerializedName("usedIngredientCount")
	@Expose
	private Integer usedIngredientCount;
	
	/** The missed ingredient count. */
	@SerializedName("missedIngredientCount")
	@Expose
	private Integer missedIngredientCount;
	
	/** The missed ingredients. */
	@SerializedName("missedIngredients")
	@Expose
	private List<MissedIngredient> missedIngredients = null;
	
	/** The likes. */
	@SerializedName("likes")
	@Expose
	private Integer likes;
	
	/** The used ingredients. */
	@SerializedName("usedIngredients")
	@Expose
	private List<Object> usedIngredients = null;
	
	/** The unused ingredients. */
	@SerializedName("unusedIngredients")
	@Expose
	private List<Object> unusedIngredients = null;

	/** The weight watcher smart points. */
	@SerializedName("weightWatcherSmartPoints")
	@Expose
	private int weightWatcherSmartPoints;

	/** The instructions. */
	@SerializedName("instructions")
	@Expose
	private String instructions;

	/** The original id. */
	@SerializedName("originalId")
	@Expose
	private Object originalId;

	/** The nutrition. */
	@SerializedName("nutrition")
	@Expose
	private Nutrition nutrition;

	/**
	 * Instantiates a new recipe.
	 */
	public Recipe() {
	}

	/**
	 * Instantiates a new recipe.
	 *
	 * @param vegetarian the vegetarian
	 * @param vegan the vegan
	 * @param glutenFree the gluten free
	 * @param dairyFree the dairy free
	 * @param veryHealthy the very healthy
	 * @param cheap the cheap
	 * @param veryPopular the very popular
	 * @param sustainable the sustainable
	 * @param weightWatcherSmartPoIntegers the weight watcher smart po integers
	 * @param gaps the gaps
	 * @param lowFodmap the low fodmap
	 * @param aggregateLikes the aggregate likes
	 * @param spoonacularScore the spoonacular score
	 * @param healthScore the health score
	 * @param creditsText the credits text
	 * @param license the license
	 * @param sourceName the source name
	 * @param pricePerServing the price per serving
	 * @param extendedIngredients the extended ingredients
	 * @param id the id
	 * @param title the title
	 * @param readyInMinutes the ready in minutes
	 * @param servings the servings
	 * @param sourceUrl the source url
	 * @param image the image
	 * @param imageType the image type
	 * @param summary the summary
	 * @param cuisines the cuisines
	 * @param dishTypes the dish types
	 * @param diets the diets
	 * @param occasions the occasions
	 * @param analyzedInstructions the analyzed instructions
	 * @param spoonacularSourceUrl the spoonacular source url
	 * @param usedIngredientCount the used ingredient count
	 * @param missedIngredientCount the missed ingredient count
	 * @param missedIngredients the missed ingredients
	 * @param likes the likes
	 * @param usedIngredients the used ingredients
	 * @param unusedIngredients the unused ingredients
	 */
	public Recipe(Boolean vegetarian, Boolean vegan, Boolean glutenFree, Boolean dairyFree, Boolean veryHealthy,
			Boolean cheap, Boolean veryPopular, Boolean sustainable, Integer weightWatcherSmartPoIntegers, String gaps,
			Boolean lowFodmap, Integer aggregateLikes, Double spoonacularScore, Double healthScore, String creditsText,
			String license, String sourceName, Double pricePerServing, List<ExtendedIngredient> extendedIngredients,
			Integer id, String title, Integer readyInMinutes, Integer servings, String sourceUrl, String image,
			String imageType, String summary, List<String> cuisines, List<String> dishTypes, List<String> diets,
			List<Object> occasions, List<Instruction> analyzedInstructions, String spoonacularSourceUrl,
			Integer usedIngredientCount, Integer missedIngredientCount, List<MissedIngredient> missedIngredients,
			Integer likes, List<Object> usedIngredients, List<Object> unusedIngredients) {
		super();
		this.vegetarian = vegetarian;
		this.vegan = vegan;
		this.glutenFree = glutenFree;
		this.dairyFree = dairyFree;
		this.veryHealthy = veryHealthy;
		this.cheap = cheap;
		this.veryPopular = veryPopular;
		this.sustainable = sustainable;
		this.weightWatcherSmartPoIntegers = weightWatcherSmartPoIntegers;
		this.gaps = gaps;
		this.lowFodmap = lowFodmap;
		this.aggregateLikes = aggregateLikes;
		this.spoonacularScore = spoonacularScore;
		this.healthScore = healthScore;
		this.creditsText = creditsText;
		this.license = license;
		this.sourceName = sourceName;
		this.pricePerServing = pricePerServing;
		this.extendedIngredients = extendedIngredients;
		this.id = id;
		this.title = title;
		this.readyInMinutes = readyInMinutes;
		this.servings = servings;
		this.sourceUrl = sourceUrl;
		this.image = image;
		this.imageType = imageType;
		this.summary = summary;
		this.cuisines = cuisines;
		this.dishTypes = dishTypes;
		this.diets = diets;
		this.occasions = occasions;
		this.analyzedInstructions = analyzedInstructions;
		this.spoonacularSourceUrl = spoonacularSourceUrl;
		this.usedIngredientCount = usedIngredientCount;
		this.missedIngredientCount = missedIngredientCount;
		this.missedIngredients = missedIngredients;
		this.likes = likes;
		this.usedIngredients = usedIngredients;
		this.unusedIngredients = unusedIngredients;
	}

	/**
	 * Checks if is vegetarian.
	 *
	 * @return the boolean
	 */
	public Boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * Sets the vegetarian.
	 *
	 * @param vegetarian the new vegetarian
	 */
	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	/**
	 * Checks if is vegan.
	 *
	 * @return the boolean
	 */
	public Boolean isVegan() {
		return vegan;
	}

	/**
	 * Sets the vegan.
	 *
	 * @param vegan the new vegan
	 */
	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}

	/**
	 * Checks if is gluten free.
	 *
	 * @return the boolean
	 */
	public Boolean isGlutenFree() {
		return glutenFree;
	}

	/**
	 * Sets the gluten free.
	 *
	 * @param glutenFree the new gluten free
	 */
	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	/**
	 * Checks if is dairy free.
	 *
	 * @return the boolean
	 */
	public Boolean isDairyFree() {
		return dairyFree;
	}

	/**
	 * Sets the dairy free.
	 *
	 * @param dairyFree the new dairy free
	 */
	public void setDairyFree(Boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	/**
	 * Checks if is very healthy.
	 *
	 * @return the boolean
	 */
	public Boolean isVeryHealthy() {
		return veryHealthy;
	}

	/**
	 * Sets the very healthy.
	 *
	 * @param veryHealthy the new very healthy
	 */
	public void setVeryHealthy(Boolean veryHealthy) {
		this.veryHealthy = veryHealthy;
	}

	/**
	 * Checks if is cheap.
	 *
	 * @return the boolean
	 */
	public Boolean isCheap() {
		return cheap;
	}

	/**
	 * Sets the cheap.
	 *
	 * @param cheap the new cheap
	 */
	public void setCheap(Boolean cheap) {
		this.cheap = cheap;
	}

	/**
	 * Checks if is very popular.
	 *
	 * @return the boolean
	 */
	public Boolean isVeryPopular() {
		return veryPopular;
	}

	/**
	 * Sets the very popular.
	 *
	 * @param veryPopular the new very popular
	 */
	public void setVeryPopular(Boolean veryPopular) {
		this.veryPopular = veryPopular;
	}

	/**
	 * Checks if is sustainable.
	 *
	 * @return the boolean
	 */
	public Boolean isSustainable() {
		return sustainable;
	}

	/**
	 * Sets the sustainable.
	 *
	 * @param sustainable the new sustainable
	 */
	public void setSustainable(Boolean sustainable) {
		this.sustainable = sustainable;
	}

	/**
	 * Gets the weight watcher smart po integers.
	 *
	 * @return the weight watcher smart po integers
	 */
	public Integer getWeightWatcherSmartPoIntegers() {
		return weightWatcherSmartPoIntegers;
	}

	/**
	 * Sets the weight watcher smart po integers.
	 *
	 * @param weightWatcherSmartPoIntegers the new weight watcher smart po integers
	 */
	public void setWeightWatcherSmartPoIntegers(Integer weightWatcherSmartPoIntegers) {
		this.weightWatcherSmartPoIntegers = weightWatcherSmartPoIntegers;
	}

	/**
	 * Gets the gaps.
	 *
	 * @return the gaps
	 */
	public String getGaps() {
		return gaps;
	}

	/**
	 * Sets the gaps.
	 *
	 * @param gaps the new gaps
	 */
	public void setGaps(String gaps) {
		this.gaps = gaps;
	}

	/**
	 * Checks if is low fodmap.
	 *
	 * @return the boolean
	 */
	public Boolean isLowFodmap() {
		return lowFodmap;
	}

	/**
	 * Sets the low fodmap.
	 *
	 * @param lowFodmap the new low fodmap
	 */
	public void setLowFodmap(Boolean lowFodmap) {
		this.lowFodmap = lowFodmap;
	}

	/**
	 * Gets the aggregate likes.
	 *
	 * @return the aggregate likes
	 */
	public Integer getAggregateLikes() {
		return aggregateLikes;
	}

	/**
	 * Sets the aggregate likes.
	 *
	 * @param aggregateLikes the new aggregate likes
	 */
	public void setAggregateLikes(Integer aggregateLikes) {
		this.aggregateLikes = aggregateLikes;
	}

	/**
	 * Gets the spoonacular score.
	 *
	 * @return the spoonacular score
	 */
	public Double getSpoonacularScore() {
		return spoonacularScore;
	}

	/**
	 * Sets the spoonacular score.
	 *
	 * @param spoonacularScore the new spoonacular score
	 */
	public void setSpoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	/**
	 * Gets the health score.
	 *
	 * @return the health score
	 */
	public Double getHealthScore() {
		return healthScore;
	}

	/**
	 * Sets the health score.
	 *
	 * @param healthScore the new health score
	 */
	public void setHealthScore(Double healthScore) {
		this.healthScore = healthScore;
	}

	/**
	 * Gets the credits text.
	 *
	 * @return the credits text
	 */
	public String getCreditsText() {
		return creditsText;
	}

	/**
	 * Sets the credits text.
	 *
	 * @param creditsText the new credits text
	 */
	public void setCreditsText(String creditsText) {
		this.creditsText = creditsText;
	}

	/**
	 * Gets the license.
	 *
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * Sets the license.
	 *
	 * @param license the new license
	 */
	public void setLicense(String license) {
		this.license = license;
	}

	/**
	 * Gets the source name.
	 *
	 * @return the source name
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * Sets the source name.
	 *
	 * @param sourceName the new source name
	 */
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * Gets the price per serving.
	 *
	 * @return the price per serving
	 */
	public Double getPricePerServing() {
		return pricePerServing;
	}

	/**
	 * Sets the price per serving.
	 *
	 * @param pricePerServing the new price per serving
	 */
	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	/**
	 * Gets the extended ingredients.
	 *
	 * @return the extended ingredients
	 */
	public List<ExtendedIngredient> getExtendedIngredients() {
		return extendedIngredients;
	}

	/**
	 * Sets the extended ingredients.
	 *
	 * @param extendedIngredients the new extended ingredients
	 */
	public void setExtendedIngredients(List<ExtendedIngredient> extendedIngredients) {
		this.extendedIngredients = extendedIngredients;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the ready in minutes.
	 *
	 * @return the ready in minutes
	 */
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	/**
	 * Sets the ready in minutes.
	 *
	 * @param readyInMinutes the new ready in minutes
	 */
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	/**
	 * Gets the servings.
	 *
	 * @return the servings
	 */
	public Integer getServings() {
		return servings;
	}

	/**
	 * Sets the servings.
	 *
	 * @param servings the new servings
	 */
	public void setServings(Integer servings) {
		this.servings = servings;
	}

	/**
	 * Gets the source url.
	 *
	 * @return the source url
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * Sets the source url.
	 *
	 * @param sourceUrl the new source url
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
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
	 * Gets the image type.
	 *
	 * @return the image type
	 */
	public String getImageType() {
		return imageType;
	}

	/**
	 * Sets the image type.
	 *
	 * @param imageType the new image type
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	/**
	 * Gets the summary.
	 *
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets the summary.
	 *
	 * @param summary the new summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * Gets the cuisines.
	 *
	 * @return the cuisines
	 */
	public List<String> getCuisines() {
		return cuisines;
	}

	/**
	 * Sets the cuisines.
	 *
	 * @param cuisines the new cuisines
	 */
	public void setCuisines(List<String> cuisines) {
		this.cuisines = cuisines;
	}

	/**
	 * Gets the dish types.
	 *
	 * @return the dish types
	 */
	public List<String> getDishTypes() {
		return dishTypes;
	}

	/**
	 * Sets the dish types.
	 *
	 * @param dishTypes the new dish types
	 */
	public void setDishTypes(List<String> dishTypes) {
		this.dishTypes = dishTypes;
	}

	/**
	 * Gets the diets.
	 *
	 * @return the diets
	 */
	public List<String> getDiets() {
		return diets;
	}

	/**
	 * Sets the diets.
	 *
	 * @param diets the new diets
	 */
	public void setDiets(List<String> diets) {
		this.diets = diets;
	}

	/**
	 * Gets the occasions.
	 *
	 * @return the occasions
	 */
	public List<Object> getOccasions() {
		return occasions;
	}

	/**
	 * Sets the occasions.
	 *
	 * @param occasions the new occasions
	 */
	public void setOccasions(List<Object> occasions) {
		this.occasions = occasions;
	}

	/**
	 * Gets the analyzed instructions.
	 *
	 * @return the analyzed instructions
	 */
	public List<Instruction> getAnalyzedInstructions() {
		return analyzedInstructions;
	}

	/**
	 * Sets the analyzed instructions.
	 *
	 * @param analyzedInstructions the new analyzed instructions
	 */
	public void setAnalyzedInstructions(List<Instruction> analyzedInstructions) {
		this.analyzedInstructions = analyzedInstructions;
	}

	/**
	 * Gets the spoonacular source url.
	 *
	 * @return the spoonacular source url
	 */
	public String getSpoonacularSourceUrl() {
		return spoonacularSourceUrl;
	}

	/**
	 * Sets the spoonacular source url.
	 *
	 * @param spoonacularSourceUrl the new spoonacular source url
	 */
	public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	/**
	 * Gets the used ingredient count.
	 *
	 * @return the used ingredient count
	 */
	public Integer getUsedIngredientCount() {
		return usedIngredientCount;
	}

	/**
	 * Sets the used ingredient count.
	 *
	 * @param usedIngredientCount the new used ingredient count
	 */
	public void setUsedIngredientCount(Integer usedIngredientCount) {
		this.usedIngredientCount = usedIngredientCount;
	}

	/**
	 * Gets the missed ingredient count.
	 *
	 * @return the missed ingredient count
	 */
	public Integer getMissedIngredientCount() {
		return missedIngredientCount;
	}

	/**
	 * Sets the missed ingredient count.
	 *
	 * @param missedIngredientCount the new missed ingredient count
	 */
	public void setMissedIngredientCount(Integer missedIngredientCount) {
		this.missedIngredientCount = missedIngredientCount;
	}

	/**
	 * Gets the missed ingredients.
	 *
	 * @return the missed ingredients
	 */
	public List<MissedIngredient> getMissedIngredients() {
		return missedIngredients;
	}

	/**
	 * Sets the missed ingredients.
	 *
	 * @param missedIngredients the new missed ingredients
	 */
	public void setMissedIngredients(List<MissedIngredient> missedIngredients) {
		this.missedIngredients = missedIngredients;
	}

	/**
	 * Gets the likes.
	 *
	 * @return the likes
	 */
	public Integer getLikes() {
		return likes;
	}

	/**
	 * Sets the likes.
	 *
	 * @param likes the new likes
	 */
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	/**
	 * Gets the used ingredients.
	 *
	 * @return the used ingredients
	 */
	public List<Object> getUsedIngredients() {
		return usedIngredients;
	}

	/**
	 * Sets the used ingredients.
	 *
	 * @param usedIngredients the new used ingredients
	 */
	public void setUsedIngredients(List<Object> usedIngredients) {
		this.usedIngredients = usedIngredients;
	}

	/**
	 * Gets the unused ingredients.
	 *
	 * @return the unused ingredients
	 */
	public List<Object> getUnusedIngredients() {
		return unusedIngredients;
	}

	/**
	 * Sets the unused ingredients.
	 *
	 * @param unusedIngredients the new unused ingredients
	 */
	public void setUnusedIngredients(List<Object> unusedIngredients) {
		this.unusedIngredients = unusedIngredients;
	}

	/**
	 * Gets the weight watcher smart points.
	 *
	 * @return the weight watcher smart points
	 */
	public int getWeightWatcherSmartPoints() {
		return weightWatcherSmartPoints;
	}

	/**
	 * Sets the weight watcher smart points.
	 *
	 * @param weightWatcherSmartPoints the new weight watcher smart points
	 */
	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints) {
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	/**
	 * Gets the instructions.
	 *
	 * @return the instructions
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * Sets the instructions.
	 *
	 * @param instructions the new instructions
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	/**
	 * Gets the original id.
	 *
	 * @return the original id
	 */
	public Object getOriginalId() {
		return originalId;
	}

	/**
	 * Sets the original id.
	 *
	 * @param originalId the new original id
	 */
	public void setOriginalId(Object originalId) {
		this.originalId = originalId;
	}

	/**
	 * Gets the nutrition.
	 *
	 * @return the nutrition
	 */
	public Nutrition getNutrition() {
		return nutrition;
	}

	/**
	 * Sets the nutrition.
	 *
	 * @param nutrition the new nutrition
	 */
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}

	/**
	 * Gets the vegetarian.
	 *
	 * @return the vegetarian
	 */
	public Boolean getVegetarian() {
		return vegetarian;
	}

	/**
	 * Gets the vegan.
	 *
	 * @return the vegan
	 */
	public Boolean getVegan() {
		return vegan;
	}

	/**
	 * Gets the gluten free.
	 *
	 * @return the gluten free
	 */
	public Boolean getGlutenFree() {
		return glutenFree;
	}

	/**
	 * Gets the dairy free.
	 *
	 * @return the dairy free
	 */
	public Boolean getDairyFree() {
		return dairyFree;
	}

	/**
	 * Gets the very healthy.
	 *
	 * @return the very healthy
	 */
	public Boolean getVeryHealthy() {
		return veryHealthy;
	}

	/**
	 * Gets the cheap.
	 *
	 * @return the cheap
	 */
	public Boolean getCheap() {
		return cheap;
	}

	/**
	 * Gets the very popular.
	 *
	 * @return the very popular
	 */
	public Boolean getVeryPopular() {
		return veryPopular;
	}

	/**
	 * Gets the sustainable.
	 *
	 * @return the sustainable
	 */
	public Boolean getSustainable() {
		return sustainable;
	}

	/**
	 * Gets the low fodmap.
	 *
	 * @return the low fodmap
	 */
	public Boolean getLowFodmap() {
		return lowFodmap;
	}

}
