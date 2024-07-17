package com.graymatter;

public class DemoOnAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractClass ac=new AbstractClass();
		AbstractChildClass acc=new AbstractChildClass();

		acc.sayHello();
		System.out.println(acc.printName("dhanya"));

	}

}
