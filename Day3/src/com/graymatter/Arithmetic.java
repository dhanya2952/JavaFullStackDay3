package com.graymatter;

public  abstract class Arithmetic extends Calculator{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}

	@Override
	public  abstract void power(int a, int b);

	@Override
	public abstract void sqroot(int a);
	
	
	

	

	
	
	
	

}
