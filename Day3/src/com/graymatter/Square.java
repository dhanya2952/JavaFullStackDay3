package com.graymatter;

public class Square extends Shape{
	
	double side;
	
	Square(double side) {
		super();
		this.side = side;
	}

	Square() {
		super();
	}
	
	public void getArea()
	{
		System.out.println(side*side);
	}
	
	public void getPerimeter()
	{
		System.out.println(4*side);
	}


	

}
