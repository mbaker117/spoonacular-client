package com.mbaker.spoonacular.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;
import com.mbaker.spoonacular.service.impl.DefaultRecipeService;
import com.mbaker.spoonacular.service.impl.DefaultSpoonacularRecipeClientService;

@SpringBootTest
public class DefaultRecipeServiceTest {

	@InjectMocks
	private RecipeService recipeService = new DefaultRecipeService();

	@Mock
	private SpoonacularRecipeClientService spoonacularRecipeClientService = new DefaultSpoonacularRecipeClientService();

	@Mock
	private Environment environment;

	@Test
	public void testSearchWithInvalidBaseUrl() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn(Strings.EMPTY);
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().search(null);

		});

		assertEquals(SpoonacularExceptionType.BASE_URL_NOT_EXISTS, exception.getType());

	}

	@Test
	public void testSearchWithInvalidApiKey() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn(Strings.EMPTY);

		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().search(any());

		});
		assertEquals(SpoonacularExceptionType.API_KEY_NOT_EXISTS, exception.getType());
	}

	@Test
	public void testGetRecipeInformationWithInvalidId() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn("123");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getRecipeService().getRecipeInformation(null);

		});

		assertEquals("id is empty", exception.getMessage());

	}

	@Test
	public void testGetRecipeInformationWithInvalidRecipe() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn("123");
		when(getSpoonacularRecipeClientService().getRecipeInformation(anyString(), anyString(), any()))
				.thenReturn(Optional.empty());
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeInformation("123");

		});
		assertEquals(SpoonacularExceptionType.RECIPE_NOT_FOUND, exception.getType());

	}

	@Test
	public void testGetRecipeInformationWithInvalidBaseUrl() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn(Strings.EMPTY);
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeInformation("111");

		});

		assertEquals(SpoonacularExceptionType.BASE_URL_NOT_EXISTS, exception.getType());

	}

	@Test
	public void testGetRecipeInformationWithInvalidApiKey() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn(Strings.EMPTY);

		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeInformation("123");

		});
		assertEquals(SpoonacularExceptionType.API_KEY_NOT_EXISTS, exception.getType());
	}

	@Test
	public void testGetRecipeCaloriesWithoutIngrediantsWithInvalidBaseUrl() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn(Strings.EMPTY);
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeCaloriesWithoutIngrediants("111", anyList());

		});

		assertEquals(SpoonacularExceptionType.BASE_URL_NOT_EXISTS, exception.getType());

	}

	@Test
	public void testGetRecipeCaloriesWithoutIngrediantsWithInvalidApiKey() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn(Strings.EMPTY);

		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeCaloriesWithoutIngrediants("123", anyList());

		});
		assertEquals(SpoonacularExceptionType.API_KEY_NOT_EXISTS, exception.getType());
	}

	@Test
	public void testtGetRecipeCaloriesWithoutIngrediantsWithInvalidRecipe() throws SpoonacularException {

		when(getEnvironment().getProperty("spoonacular.baseurl")).thenReturn("test");
		when(getEnvironment().getProperty("spoonacular.apikey")).thenReturn("122");
		when(getSpoonacularRecipeClientService().getRecipeInformation(anyString(), anyString(), any()))
				.thenReturn(Optional.empty());
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getRecipeService().getRecipeCaloriesWithoutIngrediants("123", anyList());

		});
		assertEquals(SpoonacularExceptionType.RECIPE_NOT_FOUND, exception.getType());

	}

	protected RecipeService getRecipeService() {
		return recipeService;
	}

	protected SpoonacularRecipeClientService getSpoonacularRecipeClientService() {
		return spoonacularRecipeClientService;
	}

	protected Environment getEnvironment() {
		return environment;
	}

}
