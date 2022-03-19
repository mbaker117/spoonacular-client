/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular.enums;

/**
 * The Enum CredentialParams.
 */
public enum CredentialParams {
	
	/** The api key. */
	API_KEY("apiKey");

	/** The key. */
	private final String key;

	/**
	 * Instantiates a new credential params.
	 *
	 * @param key the key
	 */
	private CredentialParams(String key) {
		this.key = key;
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
