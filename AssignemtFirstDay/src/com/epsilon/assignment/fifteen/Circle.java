//Assignment #15

package com.epsilon.assignment.fifteen;

import java.util.Arrays;

public class Circle {

	double radius;
	String color = "red";
	double area;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public static void main(String[] args) {
		Circle[] circles = { new Cylinder(12.34), new Cylinder(12.34, 10.0), new Cylinder(12.34, 10.0, "blue") };
		System.out.println(Arrays.toString(circles));
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

}
