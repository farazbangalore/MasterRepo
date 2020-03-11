package com.epsilon.assignment.day.four;

public class Square extends Rectangle {
	double side = 1.0;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(double side, String color, boolean filled, double width, double lentgh) {
		super(width, lentgh, color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}

	@Override
	public void setLentgh(double lentgh) {
		// TODO Auto-generated method stub
		super.setLentgh(lentgh);
	}

	@Override
	public String toString() {
		return "\n Square [width=" + width + ", lentgh=" + lentgh + ", color=" + color + ", filled=" + filled
				+ ", Perimeter=" + getPerimeter() + ", Area=" + getArea() + "]";
	}

}
