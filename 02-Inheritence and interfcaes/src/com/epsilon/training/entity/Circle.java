package com.epsilon.training.entity;

import java.util.logging.Logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
// final class cannot be extended
public final class Circle extends Shape {

	private double radius;
	Logger logger = Logger.getLogger(Circle.class.getName());

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		double area = radius * radius * PI;
		logger.info("Area of Circle =" + area);
	}

}
