/*
 * @author Mohammed.baker2017@gmail.com
 */

package com.mbaker.spoonacular.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The Class Measure.
 */
@JsonInclude(Include.NON_NULL)
public class Measure {

	/** The us. */
	@SerializedName("us")
	@Expose
	private Unit us;
	
	/** The metric. */
	@SerializedName("metric")
	@Expose
	private Metric metric;

	/**
	 * Instantiates a new measure.
	 */
	public Measure() {
	}

	/**
	 * Instantiates a new measure.
	 *
	 * @param us the us
	 * @param metric the metric
	 */
	public Measure(Unit us, Metric metric) {
		super();
		this.us = us;
		this.metric = metric;
	}

	/**
	 * Gets the us.
	 *
	 * @return the us
	 */
	public Unit getUs() {
		return us;
	}

	/**
	 * Sets the us.
	 *
	 * @param us the new us
	 */
	public void setUs(Unit us) {
		this.us = us;
	}

	/**
	 * Gets the metric.
	 *
	 * @return the metric
	 */
	public Metric getMetric() {
		return metric;
	}

	/**
	 * Sets the metric.
	 *
	 * @param metric the new metric
	 */
	public void setMetric(Metric metric) {
		this.metric = metric;
	}

}
