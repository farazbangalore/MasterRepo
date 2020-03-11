package com.epsilon.training.programs;

import com.epsilon.training.entity.Shape;
import com.epsilon.training.entity.Triangle;

public class PrintShapeArea {
	public static void main(String[] args) {
		
		//a variable of type Shape
		Shape s1;
		
		// object of a Shape type
		//s1=new Shape();
		
		//up-casting is implicit
		s1=new Triangle(12.5,45.6);
		
		s1.info();
		s1.printArea();
		//s1.printTriangleInfo();//a child class function cannot be invoked using parent reference
		
		//since we know that s1 refers to instance of Triangle
		//can we assign s1 back to another triangle reference
		Triangle t1;
		if(s1 instanceof Triangle) {
		t1=(Triangle) s1; // down-casting; not implicit
		// it is possible that, this kind of casting may fail at the run time,
		// if s1 is not pointing to triangle object
		
		t1.printTriangleInfo();
		System.out.println("s1==t1 is "+(s1==t1));
		}
		
	}

}
