package com.graymatter;

public abstract class AbstractClass { //if a method in a class is abstract then the class must be abstract
	
	private String name;
	
	
	public String printName(String name)
	{
		this.name=name;
		return this.name;
	}
	public abstract void sayHello();

}
