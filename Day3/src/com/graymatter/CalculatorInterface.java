package com.graymatter;
@FunctionalInterface //can have only one abstract method
public interface CalculatorInterface {

	public void add(int a, int b);
//	public void sub(int a, int b);
//	public void mul(int a, int b);
//	public void div(int a, int b);
	public default void power(int a, int b) 
	{
		System.out.println("calc interface default from power");
	}
	public default void sqroot(int a) 
	{
		System.out.println("calc interface default from square root");
	}
	
	public static void getDeveloperInfo()
	{
		System.out.println("by dhanya");
	}
}
