/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.exception.type;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum SpoonacularExceptionType.
 */
public enum SpoonacularExceptionType {

	/** The server error. */
	SERVER_ERROR(500, "service error"), /** The base url not exists. */
 BASE_URL_NOT_EXISTS(1001, "base url not exists"),
	
	/** The api key not exists. */
	API_KEY_NOT_EXISTS(1002, "api key not exists"),	
	/** The recipe not found. */
	RECIPE_NOT_FOUND(1003, "recipe not found"), 
 /** The unauthorized. */
 UNAUTHORIZED(401, "unauthorized"), 
 /** The not found. */
 NOT_FOUND(404, "not found"),
	
	/** The unkown error. */
	UNKOWN_ERROR(9999, "unkown error"), 
 /** The bad request. */
 BAD_REQUEST(400, "bad request");

	/** The code. */
	private final int code;
	
	/** The msg. */
	private final String msg;

	/**
	 * Instantiates a new spoonacular exception type.
	 *
	 * @param code the code
	 * @param msg the msg
	 */
	private SpoonacularExceptionType(int code, String msg) {
		this.msg = msg;
		this.code = code;
	}

	/**
	 * Gets the msg.
	 *
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/** The map. */
	private static Map<Integer, SpoonacularExceptionType> map = new HashMap<>();

	static {
		for (SpoonacularExceptionType spoonacularExceptionType : SpoonacularExceptionType.values()) {
			map.put(spoonacularExceptionType.code, spoonacularExceptionType);
		}
	}

	/**
	 * Gets the exception from code.
	 *
	 * @param code the code
	 * @return the exception from code
	 */
	public static SpoonacularExceptionType getExceptionFromCode(int code) {
		return map.getOrDefault(code, UNKOWN_ERROR);
	}

}
