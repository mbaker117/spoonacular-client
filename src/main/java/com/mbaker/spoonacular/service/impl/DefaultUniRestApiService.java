/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.service.impl;

import java.util.Map;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;
import com.mbaker.spoonacular.service.ApiService;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

/**
 * The Class DefaultUniRestApiService.
 */
@Service
public class DefaultUniRestApiService implements ApiService {

	static {
		Unirest.config().reset();
		Unirest.config().verifySsl(false).connectTimeout(0);
	}

	/**
	 * Http get.
	 *
	 * @param url    the url
	 * @param params the params
	 * @return the http response
	 * @throws SpoonacularException the spoonacular exception
	 */
	@Override
	public HttpResponse<String> httpGet(final String url, final Map<String, Object> params)
			throws SpoonacularException {
		Preconditions.checkArgument(Strings.isNotBlank(url), "url is empty");
		HttpResponse<String> httpResponse = null;
		try {
			httpResponse = Unirest.get(url).queryString(params).asString();
		} catch (final UnirestException ex) {
			throw new SpoonacularException(null, SpoonacularExceptionType.SERVER_ERROR, ex.getMessage());
		}

		return httpResponse;
	}
}
