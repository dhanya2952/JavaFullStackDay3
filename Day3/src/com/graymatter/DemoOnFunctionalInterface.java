package com.graymatter;

public class DemoOnFunctionalInterface implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOnFunctionalInterface dof = new DemoOnFunctionalInterface();
		System.out.println(dof.cubeOfNum(6));
		
		MyFunctionalInterface mfi=dof;
		System.out.println(mfi.cubeOfNum(6));
		
		

	}

	@Override
	public int cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
