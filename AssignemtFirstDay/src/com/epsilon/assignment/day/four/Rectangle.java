package com.epsilon.assignment.day.four;

public class Rectangle extends Shape {
	double width = 1.0;
	double lentgh = 1.0;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double lentgh) {
		super();
		this.width = width;
		this.lentgh = lentgh;
	}

	public Rectangle(double width, double lentgh, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.lentgh = lentgh;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLentgh() {
		return lentgh;
	}

	public void setLentgh(double lentgh) {
		this.lentgh = lentgh;
	}

	public double getArea() {
		return lentgh * width;
	}

	public double getPerimeter() {
		return 2 * (lentgh + width);
	}

	@Override
	public String toString() {
		return "\n Rectangle [width=" + width + ", lentgh=" + lentgh + ", color=" + color + ", filled=" + filled
				+ ", Perimeter=" + getPerimeter() + ", Area=" + getArea() + "]";
	}

}
