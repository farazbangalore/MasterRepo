package com.epsilon.training.entity;

import java.util.logging.Logger;

public abstract class Shape {

	Logger logger = Logger.getLogger(Shape.class.getCanonicalName());

	protected static final double PI;
	// Lazy initialization
	static {
		PI=3.1416;
	}
	
	// final-> subclass cannot override final methods
	public final void info() {
		logger.info("Classname: Shape");
		logger.info("Create by: Faraz Hussain <farazhussain5554@gmail.com>");

	}
	// subclasses must override abstract methods
	public abstract void printArea();
}
