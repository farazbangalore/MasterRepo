package com.epsilon.assignment.day.four;

public class Circle extends Shape {

	double radius = 1.0;

	public Circle() {
		super();
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "\n Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + ", Perimeter="
				+ getPerimeter() + ", Area=" + getArea() + "]";
	}

}
