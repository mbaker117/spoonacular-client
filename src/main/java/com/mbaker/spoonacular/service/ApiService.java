package com.mbaker.spoonacular.service;

import java.util.Map;

import com.mbaker.spoonacular.exception.SpoonacularException;

import kong.unirest.HttpResponse;

public interface ApiService {

	public HttpResponse<String> httpGet(final String url, final Map<String, Object> params) throws SpoonacularException;

}
