package com.mbaker.spoonacular.service.impl;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mbaker.spoonacular.beans.Recipe;
import com.mbaker.spoonacular.beans.RecipeInformationParams;
import com.mbaker.spoonacular.beans.RecipeSearchParams;
import com.mbaker.spoonacular.beans.RecipeSearchResult;
import com.mbaker.spoonacular.enums.CredentialParams;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;
import com.mbaker.spoonacular.service.ApiService;
import com.mbaker.spoonacular.service.SpoonacularRecipeClientService;

import kong.unirest.HttpResponse;

@Service
public class DefaultSpoonacularRecipeClientService implements SpoonacularRecipeClientService {

	private static final String BASE_URL_EMPTY_MSG = "baseUrl is empty";

	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpoonacularRecipeClientService.class);

	private static final String API_KEY_EMPTY_MSG = "apiKey is empty.";
	private static final String RECIPE_PATH = "recipes";
	private static final String SEARCH_PATH = "/complexSearch";
	private static final String RECIPE_INFO_PATH = "/information";

	@Autowired
	private Gson gson;

	@Autowired
	private ApiService apiSerivce;

	@Override
	public Optional<RecipeSearchResult> search(String baseUrl, String apiKey, RecipeSearchParams recipeSearchParams)
			throws SpoonacularException {
		validate(baseUrl, apiKey);

		Map<String, Object> requestParams = getRequestParams(apiKey);
		if (Objects.nonNull(recipeSearchParams)) {
			requestParams.putAll(getParams(recipeSearchParams));
		}
		String url = new StringBuilder().append(baseUrl).append(RECIPE_PATH).append(SEARCH_PATH).toString();
		HttpResponse<String> httpResponse = getApiSerivce().httpGet(url, requestParams);

		if (Objects.isNull(httpResponse)) {
			LOG.error("response is null");
			throw new SpoonacularException("", SpoonacularExceptionType.SERVER_ERROR,
					SpoonacularExceptionType.SERVER_ERROR.getMsg());
		}
		if (httpResponse.isSuccess()) {
			return Optional.ofNullable(getGson().fromJson(httpResponse.getBody(), RecipeSearchResult.class));
		}

		SpoonacularException exception = getExceptionFromResponse(httpResponse);
		LOG.error("Failed due to {}", exception.getMessage());
		throw exception;

	}

	private Map<String, Object> getRequestParams(String apiKey) {
		Map<String, Object> requestParams = new HashMap<>();
		requestParams.put(CredentialParams.API_KEY.getKey(), apiKey);
		return requestParams;
	}

	protected SpoonacularException getExceptionFromResponse(HttpResponse<String> httpResponse) {
		int status = httpResponse.getStatus();
		String body = httpResponse.getBody();
		SpoonacularExceptionType exceptionFromCode = SpoonacularExceptionType.getExceptionFromCode(status);
		return new SpoonacularException(body, exceptionFromCode, httpResponse.getStatusText());
	}

	protected Map<String, Object> getParams(RecipeSearchParams params) {

		String json = getGson().toJson(params);
		Type mapType = new TypeToken<Map<String, Object>>() {
		}.getType();
		return getGson().fromJson(json, mapType);
	}

	@Override
	public Optional<Recipe> getRecipeInformation(String baseUrl, String apiKey,
			RecipeInformationParams recipeInformation) throws SpoonacularException {
		validate(baseUrl, apiKey);
		Preconditions.checkArgument(Objects.nonNull(recipeInformation), "recipeInformation is null");
		Preconditions.checkArgument(Objects.nonNull(recipeInformation.getId()), "recipe Id is empty");
		String url = new StringBuilder().append(baseUrl).append(RECIPE_PATH).append("/")
				.append(recipeInformation.getId()).append(RECIPE_INFO_PATH).toString();
		Map<String, Object> requestParams = getRequestParams(apiKey);
		requestParams.put("includeNutrition", recipeInformation.isIncludeNutrition());

		HttpResponse<String> httpResponse = getApiSerivce().httpGet(url, requestParams);
		if (httpResponse.isSuccess()) {
			return Optional.ofNullable(getGson().fromJson(httpResponse.getBody(), Recipe.class));
		}

		SpoonacularException exception = getExceptionFromResponse(httpResponse);
		LOG.error("Failed due to {}", exception.getMessage());
		throw exception;
	}

	private void validate(String baseUrl, String apiKey) {
		Preconditions.checkArgument(Strings.isNotBlank(apiKey), API_KEY_EMPTY_MSG);
		Preconditions.checkArgument(Strings.isNotBlank(baseUrl), BASE_URL_EMPTY_MSG);
	}

	protected Gson getGson() {
		return gson;
	}

	protected ApiService getApiSerivce() {
		return apiSerivce;
	}

}
