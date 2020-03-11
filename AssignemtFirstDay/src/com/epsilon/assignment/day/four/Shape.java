//Assignment #17

package com.epsilon.assignment.day.four;

import java.util.Arrays;

public class Shape {
	String color;
	boolean filled;

	public Shape() {
		super();
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public static void main(String[] args) {
		Shape[] shape = { new Circle(1, "red", true), new Circle(15, "blue", false), new Rectangle(5, 6, "green", true),
				new Rectangle(5, 4, "yellow", true), new Square(5, "red", true, 5, 5) };
		System.out.println(Arrays.toString(shape));
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}

}
