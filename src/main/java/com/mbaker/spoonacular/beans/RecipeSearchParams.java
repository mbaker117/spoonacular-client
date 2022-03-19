/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class RecipeSearchParams.
 */
@JsonInclude(Include.NON_NULL)
public class RecipeSearchParams {

	/** The query. */
	private String query;

	/** The cuisine. */
	private String cuisine;

	/** The exclude cuisine. */
	private String excludeCuisine;

	/** The diet. */
	private String diet;

	/** The intolerances. */
	private String intolerances;

	/** The equipment. */
	private String equipment;

	/** The include ingredients. */
	private String includeIngredients;

	/** The exclude ingredients. */
	private String excludeIngredients;

	/** The type. */
	private String type;

	/** The instructions required. */
	private Boolean instructionsRequired;

	/** The fill ingredients. */
	private Boolean fillIngredients;

	/** The add recipe information. */
	private Boolean addRecipeInformation;

	/** The add recipe nutrition. */
	private Boolean addRecipeNutrition;

	/** The author. */
	private String author;

	/** The tags. */
	private String tags;

	/** The recipe box id. */
	private Integer recipeBoxId;

	/** The title match. */
	private String titleMatch;

	/** The max ready time. */
	private Integer maxReadyTime;

	/** The ignore pantry. */
	private Boolean ignorePantry;

	/** The sort. */
	private String sort;

	/** The sort direction. */
	private String sortDirection;

	/** The min carbs. */
	private Integer minCarbs;

	/** The max carbs. */
	private Integer maxCarbs;

	/** The min protein. */
	private Integer minProtein;

	/** The max protein. */
	private Integer maxProtein;

	/** The min calories. */
	private Integer minCalories;

	/** The max calories. */
	private Integer maxCalories;

	/** The min fat. */
	private Integer minFat;

	/** The max fat. */
	private Integer maxFat;

	/** The min alcohol. */
	private Integer minAlcohol;

	/** The max alcohol. */
	private Integer maxAlcohol;

	/** The min caffeine. */
	private Integer minCaffeine;

	/** The max caffeine. */
	private Integer maxCaffeine;

	/** The min copper. */
	private Integer minCopper;

	/** The max copper. */
	private Integer maxCopper;

	/** The min calcium. */
	private Integer minCalcium;

	/** The max calcium. */
	private Integer maxCalcium;

	/** The min choline. */
	private Integer minCholine;

	/** The max choline. */
	private Integer maxCholine;

	/** The min cholesterol. */
	private Integer minCholesterol;

	/** The max cholesterol. */
	private Integer maxCholesterol;

	/** The min fluoride. */
	private Integer minFluoride;

	/** The max fluoride. */
	private Integer maxFluoride;

	/** The min saturated fat. */
	private Integer minSaturatedFat;

	/** The max saturated fat. */
	private Integer maxSaturatedFat;

	/** The min vitamin A. */
	private Integer minVitaminA;

	/** The max vitamin A. */
	private Integer maxVitaminA;

	/** The min vitamin C. */
	private Integer minVitaminC;

	/** The max vitamin C. */
	private Integer maxVitaminC;

	/** The min vitamin D. */
	private Integer minVitaminD;

	/** The max vitamin D. */
	private Integer maxVitaminD;

	/** The min vitamin E. */
	private Integer minVitaminE;

	/** The max vitamin E. */
	private Integer maxVitaminE;

	/** The min vitamin K. */
	private Integer minVitaminK;

	/** The max vitamin K. */
	private Integer maxVitaminK;

	/** The min vitamin B 1. */
	private Integer minVitaminB1;

	/** The max vitamin B 1. */
	private Integer maxVitaminB1;

	/** The min vitamin B 2. */
	private Integer minVitaminB2;

	/** The max vitamin B 2. */
	private Integer maxVitaminB2;

	/** The min vitamin B 5. */
	private Integer minVitaminB5;

	/** The max vitamin B 5. */
	private Integer maxVitaminB5;

	/** The min vitamin B 3. */
	private Integer minVitaminB3;

	/** The max vitamin B 3. */
	private Integer maxVitaminB3;

	/** The min vitamin B 6. */
	private Integer minVitaminB6;

	/** The max vitamin B 6. */
	private Integer maxVitaminB6;

	/** The min vitamin B 12. */
	private Integer minVitaminB12;

	/** The max vitamin B 12. */
	private Integer maxVitaminB12;

	/** The min fiber. */
	private Integer minFiber;

	/** The max fiber. */
	private Integer maxFiber;

	/** The min folate. */
	private Integer minFolate;

	/** The max folate. */
	private Integer maxFolate;

	/** The min folic acid. */
	private Integer minFolicAcid;

	/** The max folic acid. */
	private Integer maxFolicAcid;

	/** The min iodine. */
	private Integer minIodine;

	/** The max iodine. */
	private Integer maxIodine;

	/** The min iron. */
	private Integer minIron;

	/** The max iron. */
	private Integer maxIron;

	/** The min magnesium. */
	private Integer minMagnesium;

	/** The max magnesium. */
	private Integer maxMagnesium;

	/** The min manganese. */
	private Integer minManganese;

	/** The max manganese. */
	private Integer maxManganese;

	/** The min phosphorus. */
	private Integer minPhosphorus;

	/** The max phosphorus. */
	private Integer maxPhosphorus;

	/** The min potassium. */
	private Integer minPotassium;

	/** The max potassium. */
	private Integer maxPotassium;

	/** The min selenium. */
	private Integer minSelenium;

	/** The max selenium. */
	private Integer maxSelenium;

	/** The min sodium. */
	private Integer minSodium;

	/** The max sodium. */
	private Integer maxSodium;

	/** The min sugar. */
	private Integer minSugar;

	/** The max sugar. */
	private Integer maxSugar;

	/** The min zinc. */
	private Integer minZinc;

	/** The max zinc. */
	private Integer maxZinc;

	/** The offset. */
	private Integer offset;

	/** The number. */
	private Integer number;

	/** The limit license. */
	private Boolean limitLicense;

	/**
	 * Gets the query.
	 *
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * Sets the query.
	 *
	 * @param query the new query
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * Gets the cuisine.
	 *
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}

	/**
	 * Sets the cuisine.
	 *
	 * @param cuisine the new cuisine
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	/**
	 * Gets the exclude cuisine.
	 *
	 * @return the exclude cuisine
	 */
	public String getExcludeCuisine() {
		return excludeCuisine;
	}

	/**
	 * Sets the exclude cuisine.
	 *
	 * @param excludeCuisine the new exclude cuisine
	 */
	public void setExcludeCuisine(String excludeCuisine) {
		this.excludeCuisine = excludeCuisine;
	}

	/**
	 * Gets the diet.
	 *
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}

	/**
	 * Sets the diet.
	 *
	 * @param diet the new diet
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}

	/**
	 * Gets the intolerances.
	 *
	 * @return the intolerances
	 */
	public String getIntolerances() {
		return intolerances;
	}

	/**
	 * Sets the intolerances.
	 *
	 * @param intolerances the new intolerances
	 */
	public void setIntolerances(String intolerances) {
		this.intolerances = intolerances;
	}

	/**
	 * Gets the equipment.
	 *
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * Sets the equipment.
	 *
	 * @param equipment the new equipment
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	/**
	 * Gets the include ingredients.
	 *
	 * @return the include ingredients
	 */
	public String getIncludeIngredients() {
		return includeIngredients;
	}

	/**
	 * Sets the include ingredients.
	 *
	 * @param includeIngredients the new include ingredients
	 */
	public void setIncludeIngredients(String includeIngredients) {
		this.includeIngredients = includeIngredients;
	}

	/**
	 * Gets the exclude ingredients.
	 *
	 * @return the exclude ingredients
	 */
	public String getExcludeIngredients() {
		return excludeIngredients;
	}

	/**
	 * Sets the exclude ingredients.
	 *
	 * @param excludeIngredients the new exclude ingredients
	 */
	public void setExcludeIngredients(String excludeIngredients) {
		this.excludeIngredients = excludeIngredients;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the instructions required.
	 *
	 * @return the instructions required
	 */
	public Boolean getInstructionsRequired() {
		return instructionsRequired;
	}

	/**
	 * Sets the instructions required.
	 *
	 * @param instructionsRequired the new instructions required
	 */
	public void setInstructionsRequired(Boolean instructionsRequired) {
		this.instructionsRequired = instructionsRequired;
	}

	/**
	 * Gets the fill ingredients.
	 *
	 * @return the fill ingredients
	 */
	public Boolean getFillIngredients() {
		return fillIngredients;
	}

	/**
	 * Sets the fill ingredients.
	 *
	 * @param fillIngredients the new fill ingredients
	 */
	public void setFillIngredients(Boolean fillIngredients) {
		this.fillIngredients = fillIngredients;
	}

	/**
	 * Gets the adds the recipe information.
	 *
	 * @return the adds the recipe information
	 */
	public Boolean getAddRecipeInformation() {
		return addRecipeInformation;
	}

	/**
	 * Sets the adds the recipe information.
	 *
	 * @param addRecipeInformation the new adds the recipe information
	 */
	public void setAddRecipeInformation(Boolean addRecipeInformation) {
		this.addRecipeInformation = addRecipeInformation;
	}

	/**
	 * Gets the adds the recipe nutrition.
	 *
	 * @return the adds the recipe nutrition
	 */
	public Boolean getAddRecipeNutrition() {
		return addRecipeNutrition;
	}

	/**
	 * Sets the adds the recipe nutrition.
	 *
	 * @param addRecipeNutrition the new adds the recipe nutrition
	 */
	public void setAddRecipeNutrition(Boolean addRecipeNutrition) {
		this.addRecipeNutrition = addRecipeNutrition;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the tags.
	 *
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * Sets the tags.
	 *
	 * @param tags the new tags
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * Gets the recipe box id.
	 *
	 * @return the recipe box id
	 */
	public Integer getRecipeBoxId() {
		return recipeBoxId;
	}

	/**
	 * Sets the recipe box id.
	 *
	 * @param recipeBoxId the new recipe box id
	 */
	public void setRecipeBoxId(Integer recipeBoxId) {
		this.recipeBoxId = recipeBoxId;
	}

	/**
	 * Gets the title match.
	 *
	 * @return the title match
	 */
	public String getTitleMatch() {
		return titleMatch;
	}

	/**
	 * Sets the title match.
	 *
	 * @param titleMatch the new title match
	 */
	public void setTitleMatch(String titleMatch) {
		this.titleMatch = titleMatch;
	}

	/**
	 * Gets the max ready time.
	 *
	 * @return the max ready time
	 */
	public Integer getMaxReadyTime() {
		return maxReadyTime;
	}

	/**
	 * Sets the max ready time.
	 *
	 * @param maxReadyTime the new max ready time
	 */
	public void setMaxReadyTime(Integer maxReadyTime) {
		this.maxReadyTime = maxReadyTime;
	}

	/**
	 * Gets the ignore pantry.
	 *
	 * @return the ignore pantry
	 */
	public Boolean getIgnorePantry() {
		return ignorePantry;
	}

	/**
	 * Sets the ignore pantry.
	 *
	 * @param ignorePantry the new ignore pantry
	 */
	public void setIgnorePantry(Boolean ignorePantry) {
		this.ignorePantry = ignorePantry;
	}

	/**
	 * Gets the sort.
	 *
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * Sets the sort.
	 *
	 * @param sort the new sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * Gets the sort direction.
	 *
	 * @return the sort direction
	 */
	public String getSortDirection() {
		return sortDirection;
	}

	/**
	 * Sets the sort direction.
	 *
	 * @param sortDirection the new sort direction
	 */
	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}

	/**
	 * Gets the min carbs.
	 *
	 * @return the min carbs
	 */
	public Integer getMinCarbs() {
		return minCarbs;
	}

	/**
	 * Sets the min carbs.
	 *
	 * @param minCarbs the new min carbs
	 */
	public void setMinCarbs(Integer minCarbs) {
		this.minCarbs = minCarbs;
	}

	/**
	 * Gets the max carbs.
	 *
	 * @return the max carbs
	 */
	public Integer getMaxCarbs() {
		return maxCarbs;
	}

	/**
	 * Sets the max carbs.
	 *
	 * @param maxCarbs the new max carbs
	 */
	public void setMaxCarbs(Integer maxCarbs) {
		this.maxCarbs = maxCarbs;
	}

	/**
	 * Gets the min protein.
	 *
	 * @return the min protein
	 */
	public Integer getMinProtein() {
		return minProtein;
	}

	/**
	 * Sets the min protein.
	 *
	 * @param minProtein the new min protein
	 */
	public void setMinProtein(Integer minProtein) {
		this.minProtein = minProtein;
	}

	/**
	 * Gets the max protein.
	 *
	 * @return the max protein
	 */
	public Integer getMaxProtein() {
		return maxProtein;
	}

	/**
	 * Sets the max protein.
	 *
	 * @param maxProtein the new max protein
	 */
	public void setMaxProtein(Integer maxProtein) {
		this.maxProtein = maxProtein;
	}

	/**
	 * Gets the min calories.
	 *
	 * @return the min calories
	 */
	public Integer getMinCalories() {
		return minCalories;
	}

	/**
	 * Sets the min calories.
	 *
	 * @param minCalories the new min calories
	 */
	public void setMinCalories(Integer minCalories) {
		this.minCalories = minCalories;
	}

	/**
	 * Gets the max calories.
	 *
	 * @return the max calories
	 */
	public Integer getMaxCalories() {
		return maxCalories;
	}

	/**
	 * Sets the max calories.
	 *
	 * @param maxCalories the new max calories
	 */
	public void setMaxCalories(Integer maxCalories) {
		this.maxCalories = maxCalories;
	}

	/**
	 * Gets the min fat.
	 *
	 * @return the min fat
	 */
	public Integer getMinFat() {
		return minFat;
	}

	/**
	 * Sets the min fat.
	 *
	 * @param minFat the new min fat
	 */
	public void setMinFat(Integer minFat) {
		this.minFat = minFat;
	}

	/**
	 * Gets the max fat.
	 *
	 * @return the max fat
	 */
	public Integer getMaxFat() {
		return maxFat;
	}

	/**
	 * Sets the max fat.
	 *
	 * @param maxFat the new max fat
	 */
	public void setMaxFat(Integer maxFat) {
		this.maxFat = maxFat;
	}

	/**
	 * Gets the min alcohol.
	 *
	 * @return the min alcohol
	 */
	public Integer getMinAlcohol() {
		return minAlcohol;
	}

	/**
	 * Sets the min alcohol.
	 *
	 * @param minAlcohol the new min alcohol
	 */
	public void setMinAlcohol(Integer minAlcohol) {
		this.minAlcohol = minAlcohol;
	}

	/**
	 * Gets the max alcohol.
	 *
	 * @return the max alcohol
	 */
	public Integer getMaxAlcohol() {
		return maxAlcohol;
	}

	/**
	 * Sets the max alcohol.
	 *
	 * @param maxAlcohol the new max alcohol
	 */
	public void setMaxAlcohol(Integer maxAlcohol) {
		this.maxAlcohol = maxAlcohol;
	}

	/**
	 * Gets the min caffeine.
	 *
	 * @return the min caffeine
	 */
	public Integer getMinCaffeine() {
		return minCaffeine;
	}

	/**
	 * Sets the min caffeine.
	 *
	 * @param minCaffeine the new min caffeine
	 */
	public void setMinCaffeine(Integer minCaffeine) {
		this.minCaffeine = minCaffeine;
	}

	/**
	 * Gets the max caffeine.
	 *
	 * @return the max caffeine
	 */
	public Integer getMaxCaffeine() {
		return maxCaffeine;
	}

	/**
	 * Sets the max caffeine.
	 *
	 * @param maxCaffeine the new max caffeine
	 */
	public void setMaxCaffeine(Integer maxCaffeine) {
		this.maxCaffeine = maxCaffeine;
	}

	/**
	 * Gets the min copper.
	 *
	 * @return the min copper
	 */
	public Integer getMinCopper() {
		return minCopper;
	}

	/**
	 * Sets the min copper.
	 *
	 * @param minCopper the new min copper
	 */
	public void setMinCopper(Integer minCopper) {
		this.minCopper = minCopper;
	}

	/**
	 * Gets the max copper.
	 *
	 * @return the max copper
	 */
	public Integer getMaxCopper() {
		return maxCopper;
	}

	/**
	 * Sets the max copper.
	 *
	 * @param maxCopper the new max copper
	 */
	public void setMaxCopper(Integer maxCopper) {
		this.maxCopper = maxCopper;
	}

	/**
	 * Gets the min calcium.
	 *
	 * @return the min calcium
	 */
	public Integer getMinCalcium() {
		return minCalcium;
	}

	/**
	 * Sets the min calcium.
	 *
	 * @param minCalcium the new min calcium
	 */
	public void setMinCalcium(Integer minCalcium) {
		this.minCalcium = minCalcium;
	}

	/**
	 * Gets the max calcium.
	 *
	 * @return the max calcium
	 */
	public Integer getMaxCalcium() {
		return maxCalcium;
	}

	/**
	 * Sets the max calcium.
	 *
	 * @param maxCalcium the new max calcium
	 */
	public void setMaxCalcium(Integer maxCalcium) {
		this.maxCalcium = maxCalcium;
	}

	/**
	 * Gets the min choline.
	 *
	 * @return the min choline
	 */
	public Integer getMinCholine() {
		return minCholine;
	}

	/**
	 * Sets the min choline.
	 *
	 * @param minCholine the new min choline
	 */
	public void setMinCholine(Integer minCholine) {
		this.minCholine = minCholine;
	}

	/**
	 * Gets the max choline.
	 *
	 * @return the max choline
	 */
	public Integer getMaxCholine() {
		return maxCholine;
	}

	/**
	 * Sets the max choline.
	 *
	 * @param maxCholine the new max choline
	 */
	public void setMaxCholine(Integer maxCholine) {
		this.maxCholine = maxCholine;
	}

	/**
	 * Gets the min cholesterol.
	 *
	 * @return the min cholesterol
	 */
	public Integer getMinCholesterol() {
		return minCholesterol;
	}

	/**
	 * Sets the min cholesterol.
	 *
	 * @param minCholesterol the new min cholesterol
	 */
	public void setMinCholesterol(Integer minCholesterol) {
		this.minCholesterol = minCholesterol;
	}

	/**
	 * Gets the max cholesterol.
	 *
	 * @return the max cholesterol
	 */
	public Integer getMaxCholesterol() {
		return maxCholesterol;
	}

	/**
	 * Sets the max cholesterol.
	 *
	 * @param maxCholesterol the new max cholesterol
	 */
	public void setMaxCholesterol(Integer maxCholesterol) {
		this.maxCholesterol = maxCholesterol;
	}

	/**
	 * Gets the min fluoride.
	 *
	 * @return the min fluoride
	 */
	public Integer getMinFluoride() {
		return minFluoride;
	}

	/**
	 * Sets the min fluoride.
	 *
	 * @param minFluoride the new min fluoride
	 */
	public void setMinFluoride(Integer minFluoride) {
		this.minFluoride = minFluoride;
	}

	/**
	 * Gets the max fluoride.
	 *
	 * @return the max fluoride
	 */
	public Integer getMaxFluoride() {
		return maxFluoride;
	}

	/**
	 * Sets the max fluoride.
	 *
	 * @param maxFluoride the new max fluoride
	 */
	public void setMaxFluoride(Integer maxFluoride) {
		this.maxFluoride = maxFluoride;
	}

	/**
	 * Gets the min saturated fat.
	 *
	 * @return the min saturated fat
	 */
	public Integer getMinSaturatedFat() {
		return minSaturatedFat;
	}

	/**
	 * Sets the min saturated fat.
	 *
	 * @param minSaturatedFat the new min saturated fat
	 */
	public void setMinSaturatedFat(Integer minSaturatedFat) {
		this.minSaturatedFat = minSaturatedFat;
	}

	/**
	 * Gets the max saturated fat.
	 *
	 * @return the max saturated fat
	 */
	public Integer getMaxSaturatedFat() {
		return maxSaturatedFat;
	}

	/**
	 * Sets the max saturated fat.
	 *
	 * @param maxSaturatedFat the new max saturated fat
	 */
	public void setMaxSaturatedFat(Integer maxSaturatedFat) {
		this.maxSaturatedFat = maxSaturatedFat;
	}

	/**
	 * Gets the min vitamin A.
	 *
	 * @return the min vitamin A
	 */
	public Integer getMinVitaminA() {
		return minVitaminA;
	}

	/**
	 * Sets the min vitamin A.
	 *
	 * @param minVitaminA the new min vitamin A
	 */
	public void setMinVitaminA(Integer minVitaminA) {
		this.minVitaminA = minVitaminA;
	}

	/**
	 * Gets the max vitamin A.
	 *
	 * @return the max vitamin A
	 */
	public Integer getMaxVitaminA() {
		return maxVitaminA;
	}

	/**
	 * Sets the max vitamin A.
	 *
	 * @param maxVitaminA the new max vitamin A
	 */
	public void setMaxVitaminA(Integer maxVitaminA) {
		this.maxVitaminA = maxVitaminA;
	}

	/**
	 * Gets the min vitamin C.
	 *
	 * @return the min vitamin C
	 */
	public Integer getMinVitaminC() {
		return minVitaminC;
	}

	/**
	 * Sets the min vitamin C.
	 *
	 * @param minVitaminC the new min vitamin C
	 */
	public void setMinVitaminC(Integer minVitaminC) {
		this.minVitaminC = minVitaminC;
	}

	/**
	 * Gets the max vitamin C.
	 *
	 * @return the max vitamin C
	 */
	public Integer getMaxVitaminC() {
		return maxVitaminC;
	}

	/**
	 * Sets the max vitamin C.
	 *
	 * @param maxVitaminC the new max vitamin C
	 */
	public void setMaxVitaminC(Integer maxVitaminC) {
		this.maxVitaminC = maxVitaminC;
	}

	/**
	 * Gets the min vitamin D.
	 *
	 * @return the min vitamin D
	 */
	public Integer getMinVitaminD() {
		return minVitaminD;
	}

	/**
	 * Sets the min vitamin D.
	 *
	 * @param minVitaminD the new min vitamin D
	 */
	public void setMinVitaminD(Integer minVitaminD) {
		this.minVitaminD = minVitaminD;
	}

	/**
	 * Gets the max vitamin D.
	 *
	 * @return the max vitamin D
	 */
	public Integer getMaxVitaminD() {
		return maxVitaminD;
	}

	/**
	 * Sets the max vitamin D.
	 *
	 * @param maxVitaminD the new max vitamin D
	 */
	public void setMaxVitaminD(Integer maxVitaminD) {
		this.maxVitaminD = maxVitaminD;
	}

	/**
	 * Gets the min vitamin E.
	 *
	 * @return the min vitamin E
	 */
	public Integer getMinVitaminE() {
		return minVitaminE;
	}

	/**
	 * Sets the min vitamin E.
	 *
	 * @param minVitaminE the new min vitamin E
	 */
	public void setMinVitaminE(Integer minVitaminE) {
		this.minVitaminE = minVitaminE;
	}

	/**
	 * Gets the max vitamin E.
	 *
	 * @return the max vitamin E
	 */
	public Integer getMaxVitaminE() {
		return maxVitaminE;
	}

	/**
	 * Sets the max vitamin E.
	 *
	 * @param maxVitaminE the new max vitamin E
	 */
	public void setMaxVitaminE(Integer maxVitaminE) {
		this.maxVitaminE = maxVitaminE;
	}

	/**
	 * Gets the min vitamin K.
	 *
	 * @return the min vitamin K
	 */
	public Integer getMinVitaminK() {
		return minVitaminK;
	}

	/**
	 * Sets the min vitamin K.
	 *
	 * @param minVitaminK the new min vitamin K
	 */
	public void setMinVitaminK(Integer minVitaminK) {
		this.minVitaminK = minVitaminK;
	}

	/**
	 * Gets the max vitamin K.
	 *
	 * @return the max vitamin K
	 */
	public Integer getMaxVitaminK() {
		return maxVitaminK;
	}

	/**
	 * Sets the max vitamin K.
	 *
	 * @param maxVitaminK the new max vitamin K
	 */
	public void setMaxVitaminK(Integer maxVitaminK) {
		this.maxVitaminK = maxVitaminK;
	}

	/**
	 * Gets the min vitamin B 1.
	 *
	 * @return the min vitamin B 1
	 */
	public Integer getMinVitaminB1() {
		return minVitaminB1;
	}

	/**
	 * Sets the min vitamin B 1.
	 *
	 * @param minVitaminB1 the new min vitamin B 1
	 */
	public void setMinVitaminB1(Integer minVitaminB1) {
		this.minVitaminB1 = minVitaminB1;
	}

	/**
	 * Gets the max vitamin B 1.
	 *
	 * @return the max vitamin B 1
	 */
	public Integer getMaxVitaminB1() {
		return maxVitaminB1;
	}

	/**
	 * Sets the max vitamin B 1.
	 *
	 * @param maxVitaminB1 the new max vitamin B 1
	 */
	public void setMaxVitaminB1(Integer maxVitaminB1) {
		this.maxVitaminB1 = maxVitaminB1;
	}

	/**
	 * Gets the min vitamin B 2.
	 *
	 * @return the min vitamin B 2
	 */
	public Integer getMinVitaminB2() {
		return minVitaminB2;
	}

	/**
	 * Sets the min vitamin B 2.
	 *
	 * @param minVitaminB2 the new min vitamin B 2
	 */
	public void setMinVitaminB2(Integer minVitaminB2) {
		this.minVitaminB2 = minVitaminB2;
	}

	/**
	 * Gets the max vitamin B 2.
	 *
	 * @return the max vitamin B 2
	 */
	public Integer getMaxVitaminB2() {
		return maxVitaminB2;
	}

	/**
	 * Sets the max vitamin B 2.
	 *
	 * @param maxVitaminB2 the new max vitamin B 2
	 */
	public void setMaxVitaminB2(Integer maxVitaminB2) {
		this.maxVitaminB2 = maxVitaminB2;
	}

	/**
	 * Gets the min vitamin B 5.
	 *
	 * @return the min vitamin B 5
	 */
	public Integer getMinVitaminB5() {
		return minVitaminB5;
	}

	/**
	 * Sets the min vitamin B 5.
	 *
	 * @param minVitaminB5 the new min vitamin B 5
	 */
	public void setMinVitaminB5(Integer minVitaminB5) {
		this.minVitaminB5 = minVitaminB5;
	}

	/**
	 * Gets the max vitamin B 5.
	 *
	 * @return the max vitamin B 5
	 */
	public Integer getMaxVitaminB5() {
		return maxVitaminB5;
	}

	/**
	 * Sets the max vitamin B 5.
	 *
	 * @param maxVitaminB5 the new max vitamin B 5
	 */
	public void setMaxVitaminB5(Integer maxVitaminB5) {
		this.maxVitaminB5 = maxVitaminB5;
	}

	/**
	 * Gets the min vitamin B 3.
	 *
	 * @return the min vitamin B 3
	 */
	public Integer getMinVitaminB3() {
		return minVitaminB3;
	}

	/**
	 * Sets the min vitamin B 3.
	 *
	 * @param minVitaminB3 the new min vitamin B 3
	 */
	public void setMinVitaminB3(Integer minVitaminB3) {
		this.minVitaminB3 = minVitaminB3;
	}

	/**
	 * Gets the max vitamin B 3.
	 *
	 * @return the max vitamin B 3
	 */
	public Integer getMaxVitaminB3() {
		return maxVitaminB3;
	}

	/**
	 * Sets the max vitamin B 3.
	 *
	 * @param maxVitaminB3 the new max vitamin B 3
	 */
	public void setMaxVitaminB3(Integer maxVitaminB3) {
		this.maxVitaminB3 = maxVitaminB3;
	}

	/**
	 * Gets the min vitamin B 6.
	 *
	 * @return the min vitamin B 6
	 */
	public Integer getMinVitaminB6() {
		return minVitaminB6;
	}

	/**
	 * Sets the min vitamin B 6.
	 *
	 * @param minVitaminB6 the new min vitamin B 6
	 */
	public void setMinVitaminB6(Integer minVitaminB6) {
		this.minVitaminB6 = minVitaminB6;
	}

	/**
	 * Gets the max vitamin B 6.
	 *
	 * @return the max vitamin B 6
	 */
	public Integer getMaxVitaminB6() {
		return maxVitaminB6;
	}

	/**
	 * Sets the max vitamin B 6.
	 *
	 * @param maxVitaminB6 the new max vitamin B 6
	 */
	public void setMaxVitaminB6(Integer maxVitaminB6) {
		this.maxVitaminB6 = maxVitaminB6;
	}

	/**
	 * Gets the min vitamin B 12.
	 *
	 * @return the min vitamin B 12
	 */
	public Integer getMinVitaminB12() {
		return minVitaminB12;
	}

	/**
	 * Sets the min vitamin B 12.
	 *
	 * @param minVitaminB12 the new min vitamin B 12
	 */
	public void setMinVitaminB12(Integer minVitaminB12) {
		this.minVitaminB12 = minVitaminB12;
	}

	/**
	 * Gets the max vitamin B 12.
	 *
	 * @return the max vitamin B 12
	 */
	public Integer getMaxVitaminB12() {
		return maxVitaminB12;
	}

	/**
	 * Sets the max vitamin B 12.
	 *
	 * @param maxVitaminB12 the new max vitamin B 12
	 */
	public void setMaxVitaminB12(Integer maxVitaminB12) {
		this.maxVitaminB12 = maxVitaminB12;
	}

	/**
	 * Gets the min fiber.
	 *
	 * @return the min fiber
	 */
	public Integer getMinFiber() {
		return minFiber;
	}

	/**
	 * Sets the min fiber.
	 *
	 * @param minFiber the new min fiber
	 */
	public void setMinFiber(Integer minFiber) {
		this.minFiber = minFiber;
	}

	/**
	 * Gets the max fiber.
	 *
	 * @return the max fiber
	 */
	public Integer getMaxFiber() {
		return maxFiber;
	}

	/**
	 * Sets the max fiber.
	 *
	 * @param maxFiber the new max fiber
	 */
	public void setMaxFiber(Integer maxFiber) {
		this.maxFiber = maxFiber;
	}

	/**
	 * Gets the min folate.
	 *
	 * @return the min folate
	 */
	public Integer getMinFolate() {
		return minFolate;
	}

	/**
	 * Sets the min folate.
	 *
	 * @param minFolate the new min folate
	 */
	public void setMinFolate(Integer minFolate) {
		this.minFolate = minFolate;
	}

	/**
	 * Gets the max folate.
	 *
	 * @return the max folate
	 */
	public Integer getMaxFolate() {
		return maxFolate;
	}

	/**
	 * Sets the max folate.
	 *
	 * @param maxFolate the new max folate
	 */
	public void setMaxFolate(Integer maxFolate) {
		this.maxFolate = maxFolate;
	}

	/**
	 * Gets the min folic acid.
	 *
	 * @return the min folic acid
	 */
	public Integer getMinFolicAcid() {
		return minFolicAcid;
	}

	/**
	 * Sets the min folic acid.
	 *
	 * @param minFolicAcid the new min folic acid
	 */
	public void setMinFolicAcid(Integer minFolicAcid) {
		this.minFolicAcid = minFolicAcid;
	}

	/**
	 * Gets the max folic acid.
	 *
	 * @return the max folic acid
	 */
	public Integer getMaxFolicAcid() {
		return maxFolicAcid;
	}

	/**
	 * Sets the max folic acid.
	 *
	 * @param maxFolicAcid the new max folic acid
	 */
	public void setMaxFolicAcid(Integer maxFolicAcid) {
		this.maxFolicAcid = maxFolicAcid;
	}

	/**
	 * Gets the min iodine.
	 *
	 * @return the min iodine
	 */
	public Integer getMinIodine() {
		return minIodine;
	}

	/**
	 * Sets the min iodine.
	 *
	 * @param minIodine the new min iodine
	 */
	public void setMinIodine(Integer minIodine) {
		this.minIodine = minIodine;
	}

	/**
	 * Gets the max iodine.
	 *
	 * @return the max iodine
	 */
	public Integer getMaxIodine() {
		return maxIodine;
	}

	/**
	 * Sets the max iodine.
	 *
	 * @param maxIodine the new max iodine
	 */
	public void setMaxIodine(Integer maxIodine) {
		this.maxIodine = maxIodine;
	}

	/**
	 * Gets the min iron.
	 *
	 * @return the min iron
	 */
	public Integer getMinIron() {
		return minIron;
	}

	/**
	 * Sets the min iron.
	 *
	 * @param minIron the new min iron
	 */
	public void setMinIron(Integer minIron) {
		this.minIron = minIron;
	}

	/**
	 * Gets the max iron.
	 *
	 * @return the max iron
	 */
	public Integer getMaxIron() {
		return maxIron;
	}

	/**
	 * Sets the max iron.
	 *
	 * @param maxIron the new max iron
	 */
	public void setMaxIron(Integer maxIron) {
		this.maxIron = maxIron;
	}

	/**
	 * Gets the min magnesium.
	 *
	 * @return the min magnesium
	 */
	public Integer getMinMagnesium() {
		return minMagnesium;
	}

	/**
	 * Sets the min magnesium.
	 *
	 * @param minMagnesium the new min magnesium
	 */
	public void setMinMagnesium(Integer minMagnesium) {
		this.minMagnesium = minMagnesium;
	}

	/**
	 * Gets the max magnesium.
	 *
	 * @return the max magnesium
	 */
	public Integer getMaxMagnesium() {
		return maxMagnesium;
	}

	/**
	 * Sets the max magnesium.
	 *
	 * @param maxMagnesium the new max magnesium
	 */
	public void setMaxMagnesium(Integer maxMagnesium) {
		this.maxMagnesium = maxMagnesium;
	}

	/**
	 * Gets the min manganese.
	 *
	 * @return the min manganese
	 */
	public Integer getMinManganese() {
		return minManganese;
	}

	/**
	 * Sets the min manganese.
	 *
	 * @param minManganese the new min manganese
	 */
	public void setMinManganese(Integer minManganese) {
		this.minManganese = minManganese;
	}

	/**
	 * Gets the max manganese.
	 *
	 * @return the max manganese
	 */
	public Integer getMaxManganese() {
		return maxManganese;
	}

	/**
	 * Sets the max manganese.
	 *
	 * @param maxManganese the new max manganese
	 */
	public void setMaxManganese(Integer maxManganese) {
		this.maxManganese = maxManganese;
	}

	/**
	 * Gets the min phosphorus.
	 *
	 * @return the min phosphorus
	 */
	public Integer getMinPhosphorus() {
		return minPhosphorus;
	}

	/**
	 * Sets the min phosphorus.
	 *
	 * @param minPhosphorus the new min phosphorus
	 */
	public void setMinPhosphorus(Integer minPhosphorus) {
		this.minPhosphorus = minPhosphorus;
	}

	/**
	 * Gets the max phosphorus.
	 *
	 * @return the max phosphorus
	 */
	public Integer getMaxPhosphorus() {
		return maxPhosphorus;
	}

	/**
	 * Sets the max phosphorus.
	 *
	 * @param maxPhosphorus the new max phosphorus
	 */
	public void setMaxPhosphorus(Integer maxPhosphorus) {
		this.maxPhosphorus = maxPhosphorus;
	}

	/**
	 * Gets the min potassium.
	 *
	 * @return the min potassium
	 */
	public Integer getMinPotassium() {
		return minPotassium;
	}

	/**
	 * Sets the min potassium.
	 *
	 * @param minPotassium the new min potassium
	 */
	public void setMinPotassium(Integer minPotassium) {
		this.minPotassium = minPotassium;
	}

	/**
	 * Gets the max potassium.
	 *
	 * @return the max potassium
	 */
	public Integer getMaxPotassium() {
		return maxPotassium;
	}

	/**
	 * Sets the max potassium.
	 *
	 * @param maxPotassium the new max potassium
	 */
	public void setMaxPotassium(Integer maxPotassium) {
		this.maxPotassium = maxPotassium;
	}

	/**
	 * Gets the min selenium.
	 *
	 * @return the min selenium
	 */
	public Integer getMinSelenium() {
		return minSelenium;
	}

	/**
	 * Sets the min selenium.
	 *
	 * @param minSelenium the new min selenium
	 */
	public void setMinSelenium(Integer minSelenium) {
		this.minSelenium = minSelenium;
	}

	/**
	 * Gets the max selenium.
	 *
	 * @return the max selenium
	 */
	public Integer getMaxSelenium() {
		return maxSelenium;
	}

	/**
	 * Sets the max selenium.
	 *
	 * @param maxSelenium the new max selenium
	 */
	public void setMaxSelenium(Integer maxSelenium) {
		this.maxSelenium = maxSelenium;
	}

	/**
	 * Gets the min sodium.
	 *
	 * @return the min sodium
	 */
	public Integer getMinSodium() {
		return minSodium;
	}

	/**
	 * Sets the min sodium.
	 *
	 * @param minSodium the new min sodium
	 */
	public void setMinSodium(Integer minSodium) {
		this.minSodium = minSodium;
	}

	/**
	 * Gets the max sodium.
	 *
	 * @return the max sodium
	 */
	public Integer getMaxSodium() {
		return maxSodium;
	}

	/**
	 * Sets the max sodium.
	 *
	 * @param maxSodium the new max sodium
	 */
	public void setMaxSodium(Integer maxSodium) {
		this.maxSodium = maxSodium;
	}

	/**
	 * Gets the min sugar.
	 *
	 * @return the min sugar
	 */
	public Integer getMinSugar() {
		return minSugar;
	}

	/**
	 * Sets the min sugar.
	 *
	 * @param minSugar the new min sugar
	 */
	public void setMinSugar(Integer minSugar) {
		this.minSugar = minSugar;
	}

	/**
	 * Gets the max sugar.
	 *
	 * @return the max sugar
	 */
	public Integer getMaxSugar() {
		return maxSugar;
	}

	/**
	 * Sets the max sugar.
	 *
	 * @param maxSugar the new max sugar
	 */
	public void setMaxSugar(Integer maxSugar) {
		this.maxSugar = maxSugar;
	}

	/**
	 * Gets the min zinc.
	 *
	 * @return the min zinc
	 */
	public Integer getMinZinc() {
		return minZinc;
	}

	/**
	 * Sets the min zinc.
	 *
	 * @param minZinc the new min zinc
	 */
	public void setMinZinc(Integer minZinc) {
		this.minZinc = minZinc;
	}

	/**
	 * Gets the max zinc.
	 *
	 * @return the max zinc
	 */
	public Integer getMaxZinc() {
		return maxZinc;
	}

	/**
	 * Sets the max zinc.
	 *
	 * @param maxZinc the new max zinc
	 */
	public void setMaxZinc(Integer maxZinc) {
		this.maxZinc = maxZinc;
	}

	/**
	 * Gets the offset.
	 *
	 * @return the offset
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset the new offset
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * Gets the limit license.
	 *
	 * @return the limit license
	 */
	public Boolean getLimitLicense() {
		return limitLicense;
	}

	/**
	 * Sets the limit license.
	 *
	 * @param limitLicense the new limit license
	 */
	public void setLimitLicense(Boolean limitLicense) {
		this.limitLicense = limitLicense;
	}

}
