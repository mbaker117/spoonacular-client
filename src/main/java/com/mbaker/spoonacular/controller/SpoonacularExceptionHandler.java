/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.google.gson.Gson;
import com.mbaker.spoonacular.beans.ErrorBean;
import com.mbaker.spoonacular.exception.SpoonacularException;
import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;

/**
 * The Class SpoonacularExceptionHandler.
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class SpoonacularExceptionHandler extends ResponseEntityExceptionHandler {

	/** The gson. */
	@Autowired
	private Gson gson;

	/**
	 * Handle spoonacular exception.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ResponseBody
	@ExceptionHandler({ SpoonacularException.class })
	public ResponseEntity<ErrorBean> handleSpoonacularException(final SpoonacularException ex) {
		SpoonacularExceptionType type = ex.getType();
		ErrorBean errorBean = new ErrorBean();
		switch (type) {
		case SERVER_ERROR:
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		case NOT_FOUND:
		case UNAUTHORIZED:
		case BAD_REQUEST:
			return new ResponseEntity<>(getGson().fromJson(ex.getErrorMsg(), ErrorBean.class),
					HttpStatus.valueOf(type.getCode()));
		default:
			errorBean.setCode(type.getCode());
			errorBean.setMessage(type.getMsg());
			errorBean.setStatus(type.toString());
			return new ResponseEntity<>(errorBean,HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	/**
	 * Gets the gson.
	 *
	 * @return the gson
	 */
	protected Gson getGson() {
		return gson;
	}
}
