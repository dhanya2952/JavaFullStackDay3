package com.graymatter;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s= new Shape();
		s.getArea();
		s.getPerimeter();
		
		Square sq= new Square(4);
		sq.getArea();
		sq.getPerimeter();
		
		Circle c= new Circle(5);
		c.getArea();
		c.getPerimeter();
		
		Shape s1= new Square(6);
		s1.getArea();
		
		s1=new Circle(3);
		s1.getPerimeter();

	}

}
