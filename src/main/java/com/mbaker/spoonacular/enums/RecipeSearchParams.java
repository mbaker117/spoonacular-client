/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.enums;

/**
 * The Enum RecipeSearchParams.
 */
public enum RecipeSearchParams {

	/** The query. */
	QUERY("query", String.class),
	/** The cuisine. */
	CUISINE("cuisine", String.class),
	/** The exclude cuisine. */
	EXCLUDE_CUISINE("excludeCuisine", String.class),

	/** The diet. */
	DIET("diet", String.class),
	/** The intolerances. */
	INTOLERANCES("intolerances", String.class),
	/** The equipment. */
	EQUIPMENT("equipment", String.class),

	/** The include ingredients. */
	INCLUDE_INGREDIENTS("includeIngredients", String.class),
	/** The exclude ingredients. */
	EXCLUDE_INGREDIENTS("excludeIngredients", String.class),

	/** The type. */
	TYPE("type", String.class),
	/** The instructions required. */
	INSTRUCTIONS_REQUIRED("instructionsRequired", Boolean.class),

	/** The fill ingredients. */
	FILL_INGREDIENTS("fillIngredients", Boolean.class),
	/** The add recipe information. */
	ADD_RECIPE_INFORMATION("addRecipeInformation", Boolean.class),

	/** The add recipe nutrition. */
	ADD_RECIPE_NUTRITION("addRecipeNutrition", Boolean.class),
	/** The author. */
	AUTHOR("author", String.class),

	/** The tags. */
	TAGS("tags", String.class),
	/** The recipe boxid. */
	RECIPE_BOXID("recipeBoxId", Integer.class),
	/** The title match. */
	TITLE_MATCH("titleMatch", String.class),

	/** The max ready time. */
	MAX_READY_TIME("maxReadyTime", Integer.class),
	/** The ignore pantry. */
	IGNORE_PANTRY("ignorePantry", Boolean.class),

	/** The sort. */
	SORT("sort", String.class),
	/** The sort direction. */
	SORT_DIRECTION("sortDirection", String.class),
	/** The min carbs. */
	MIN_CARBS("minCarbs", Integer.class),

	/** The max carbs. */
	MAX_CARBS("maxCarbs", Integer.class),
	/** The min protein. */
	MIN_PROTEIN("minProtein", Integer.class),

	/** The max protein. */
	MAX_PROTEIN("maxProtein", Integer.class),
	/** The min calories. */
	MIN_CALORIES("minCalories", Integer.class),

	/** The max calories. */
	MAX_CALORIES("maxCalories", Integer.class),
	/** The min fat. */
	MIN_FAT("minFat", Integer.class),
	/** The max fat. */
	MAX_FAT("maxFat", Integer.class),

	/** The min alcohol. */
	MIN_ALCOHOL("minAlcohol", Integer.class),
	/** The max alcohol. */
	MAX_ALCOHOL("maxAlcohol", Integer.class),

	/** The min caffeine. */
	MIN_CAFFEINE("minCaffeine", Integer.class),
	/** The max caffeine. */
	MAX_CAFFEINE("maxCaffeine", Integer.class),

	/** The min copper. */
	MIN_COPPER("minCopper", Integer.class),
	/** The max copper. */
	MAX_COPPER("maxCopper", Integer.class),

	/** The min calcium. */
	MIN_CALCIUM("minCalcium", Integer.class),
	/** The max calcium. */
	MAX_CALCIUM("maxCalcium", Integer.class),

	/** The min choline. */
	MIN_CHOLINE("minCholine", Integer.class),
	/** The max choline. */
	MAX_CHOLINE("maxCholine", Integer.class),

	/** The min cholesterol. */
	MIN_CHOLESTEROL("minCholesterol", Integer.class),
	/** The max cholesterol. */
	MAX_CHOLESTEROL("maxCholesterol", Integer.class),

	/** The min fluoride. */
	MIN_FLUORIDE("minFluoride", Integer.class),
	/** The max fluoride. */
	MAX_FLUORIDE("maxFluoride", Integer.class),

	/** The min saturatedfat. */
	MIN_SATURATEDFAT("minSaturatedFat", Integer.class),
	/** The max saturatedfat. */
	MAX_SATURATEDFAT("maxSaturatedFat", Integer.class),

	/** The min vitamin a. */
	MIN_VITAMIN_A("minVitaminA", Integer.class),
	/** The max vitamin a. */
	MAX_VITAMIN_A("maxVitaminA", Integer.class),

	/** The min vitamin c. */
	MIN_VITAMIN_C("minVitaminC", Integer.class),
	/** The max vitamin c. */
	MAX_VITAMIN_C("maxVitaminC", Integer.class),

	/** The min vitamin d. */
	MIN_VITAMIN_D("minVitaminD", Integer.class),
	/** The max vitamin d. */
	MAX_VITAMIN_D("maxVitaminD", Integer.class),

	/** The min vitamin e. */
	MIN_VITAMIN_E("minVitaminE", Integer.class),
	/** The max vitamin e. */
	MAX_VITAMIN_E("maxVitaminE", Integer.class),

	/** The min vitamin k. */
	MIN_VITAMIN_K("minVitaminK", Integer.class),
	/** The max vitamin k. */
	MAX_VITAMIN_K("maxVitaminK", Integer.class),

	/** The min vitamin b1. */
	MIN_VITAMIN_B1("minVitaminB1", Integer.class),
	/** The max vitamin b1. */
	MAX_VITAMIN_B1("maxVitaminB1", Integer.class),

	/** The min vitamin b2. */
	MIN_VITAMIN_B2("minVitaminB2", Integer.class),
	/** The max vitamin b2. */
	MAX_VITAMIN_B2("maxVitaminB2", Integer.class),

	/** The min vitamin b5. */
	MIN_VITAMIN_B5("minVitaminB5", Integer.class),
	/** The max vitamin b5. */
	MAX_VITAMIN_B5("maxVitaminB5", Integer.class),

	/** The min vitamin b3. */
	MIN_VITAMIN_B3("minVitaminB3", Integer.class),
	/** The max vitamin b3. */
	MAX_VITAMIN_B3("maxVitaminB3", Integer.class),

	/** The min vitamin b6. */
	MIN_VITAMIN_B6("minVitaminB6", Integer.class),
	/** The max vitamin b6. */
	MAX_VITAMIN_B6("maxVitaminB6", Integer.class),

	/** The min vitamin b12. */
	MIN_VITAMIN_B12("minVitaminB12", Integer.class),
	/** The max vitamin b12. */
	MAX_VITAMIN_B12("maxVitaminB12", Integer.class),

	/** The min fiber. */
	MIN_FIBER("minFiber", Integer.class),
	/** The max fiber. */
	MAX_FIBER("maxFiber", Integer.class),
	/** The min folate. */
	MIN_FOLATE("minFolate", Integer.class),

	/** The max folate. */
	MAX_FOLATE("maxFolate", Integer.class),
	/** The min folic acid. */
	MIN_FOLIC_ACID("minFolicAcid", Integer.class),

	/** The max folic acid. */
	MAX_FOLIC_ACID("maxFolicAcid", Integer.class),
	/** The min iodine. */
	MIN_IODINE("minIodine", Integer.class),

	/** The max iodine. */
	MAX_IODINE("maxIodine", Integer.class),
	/** The min iron. */
	MIN_IRON("minIron", Integer.class),
	/** The max iron. */
	MAX_IRON("maxIron", Integer.class),

	/** The min magnesium. */
	MIN_MAGNESIUM("minMagnesium", Integer.class),
	/** The max magnesium. */
	MAX_MAGNESIUM("maxMagnesium", Integer.class),

	/** The min manganese. */
	MIN_MANGANESE("minManganese", Integer.class),
	/** The max manganese. */
	MAX_MANGANESE("maxManganese", Integer.class),

	/** The min phosphorus. */
	MIN_PHOSPHORUS("minPhosphorus", Integer.class),
	/** The max phosphorus. */
	MAX_PHOSPHORUS("maxPhosphorus", Integer.class),

	/** The min potassium. */
	MIN_POTASSIUM("minPotassium", Integer.class),
	/** The max potassium. */
	MAX_POTASSIUM("maxPotassium", Integer.class),

	/** The min selenium. */
	MIN_SELENIUM("minSelenium", Integer.class),
	/** The max selenium. */
	MAX_SELENIUM("maxSelenium", Integer.class),

	/** The min sodium. */
	MIN_SODIUM("minSodium", Integer.class),
	/** The max sodium. */
	MAX_SODIUM("maxSodium", Integer.class),

	/** The min sugar. */
	MIN_SUGAR("minSugar", Integer.class),
	/** The max sugar. */
	MAX_SUGAR("maxSugar", Integer.class),
	/** The min zinc. */
	MIN_ZINC("minZinc", Integer.class),

	/** The max zinc. */
	MAX_ZINC("maxZinc", Integer.class),
	/** The offset. */
	OFFSET("offset", Integer.class),
	/** The number. */
	NUMBER("number", Integer.class),

	/** The limit license. */
	LIMIT_LICENSE("limitLicense", Boolean.class);

	/** The key. */
	private final String key;

	/** The clazz. */
	private final Class<?> clazz;

	/**
	 * Instantiates a new recipe search params.
	 *
	 * @param key   the key
	 * @param clazz the clazz
	 */
	private RecipeSearchParams(String key, Class<?> clazz) {
		this.key = key;
		this.clazz = clazz;
	}

	/**
	 * Gets the clazz.
	 *
	 * @return the clazz
	 */
	public Class<?> getClazz() {
		return clazz;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

}
