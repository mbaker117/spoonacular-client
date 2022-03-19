package com.mbaker.spoonacular.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mbaker.spoonacular.beans.RecipeInformationParams;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;
import com.mbaker.spoonacular.service.impl.DefaultSpoonacularRecipeClientService;
import com.mbaker.spoonacular.service.impl.DefaultUniRestApiService;

@SpringBootTest
public class DefaultSpoonacularRecipeClientServiceTest {

	@InjectMocks
	private SpoonacularRecipeClientService spoonacularRecipeClientService = new DefaultSpoonacularRecipeClientService();

	@Mock
	private ApiService apiService = new DefaultUniRestApiService();

	@Test
	public void testSearchWithInvalidBaseUrl() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().search(null, "123", null);
		});
		assertEquals("baseUrl is empty", exception.getMessage());

	}

	@Test
	public void testSearchWithInvalidApiKey() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().search("https://api.spoonacular.com/", null, null);
		});
		assertEquals("apiKey is empty.", exception.getMessage());

	}

	@Test
	public void testSearchWithNullResponse() throws SpoonacularException {

		when(getApiService().httpGet(anyString(), anyMap())).thenReturn(null);
		SpoonacularException exception = assertThrows(SpoonacularException.class, () -> {
			getSpoonacularRecipeClientService().search("https://api.spoonacular.com/", "1234", null);
		});
		assertEquals(SpoonacularExceptionType.SERVER_ERROR, exception.getType());

	}

	@Test
	public void testGetRecipeInformationWithInvalidBaseUrl() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().getRecipeInformation(null, "123", null);
		});
		assertEquals("baseUrl is empty", exception.getMessage());

	}

	@Test
	public void testGetRecipeInformationWithInvalidApiKey() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().getRecipeInformation("https://api.spoonacular.com/", null, null);
		});
		assertEquals("apiKey is empty.", exception.getMessage());

	}

	@Test
	public void testGetRecipeInformationWithInvalidRecipeInformationParams() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().getRecipeInformation("https://api.spoonacular.com/", "1234", null);
		});
		assertEquals("recipeInformation is null", exception.getMessage());

	}

	@Test
	public void testGetRecipeInformationWithInvalidRecipeId() {

		RecipeInformationParams recipeInformationParams = new RecipeInformationParams(null, false);

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			getSpoonacularRecipeClientService().getRecipeInformation("https://api.spoonacular.com/", "1234",
					recipeInformationParams);
		});
		assertEquals("recipe Id is empty", exception.getMessage());

	}

	@Test
	public void testGetRecipeInformationWithNullResponse() throws SpoonacularException {

		RecipeInformationParams recipeInformationParams = new RecipeInformationParams("123", false);
		when(getApiService().httpGet(anyString(), anyMap())).thenReturn(null);
		assertThrows(NullPointerException.class, () -> {
			getSpoonacularRecipeClientService().getRecipeInformation("https://api.spoonacular.com/", "1234",
					recipeInformationParams);
		});

	}

	protected SpoonacularRecipeClientService getSpoonacularRecipeClientService() {
		return spoonacularRecipeClientService;
	}

	protected ApiService getApiService() {
		return apiService;
	}

}
