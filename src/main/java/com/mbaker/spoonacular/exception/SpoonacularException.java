/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.exception;

import com.mbaker.spoonacular.exception.type.SpoonacularExceptionType;

/**
 * The Class SpoonacularException.
 */
public class SpoonacularException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2783683830889316030L;

	/** The error msg. */
	private final String errorMsg;

	/** The type. */
	private final SpoonacularExceptionType type;


	
	/**
	 * Instantiates a new spoonacular exception.
	 *
	 * @param errorMsg the error msg
	 * @param type the type
	 * @param msg the msg
	 */
	public SpoonacularException(String errorMsg, SpoonacularExceptionType type, String msg) {
		super(msg);
		this.errorMsg = errorMsg;
		this.type = type;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public SpoonacularExceptionType getType() {
		return type;
	}


	/**
	 * Gets the error msg.
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	
}
