package com.graymatter;

public class MainCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scientific sc = new Scientific();
//		sc.power(2, 3);
//		
//		Arithmetic ac = new Scientific(); //dynamic binding-reference to the child methods using the parent instance
//		ac.add(2, 3);
//		ac.div(2, 3);
//		
//		ac.mul(2, 3);
//		ac.sqroot(3);
//		ac.sub(3, 2);
		
//		CalculatorInterface ci=new MainCalcInterface();
//		ci.add(5, 6);
//		
//		ScientificCalcInterface msi=new MainCalcInterface();
//		msi.power(6,7);
//		
//		MainCalcInterface mc =new MainCalcInterface();
//	    mc.add(5, 6);
		
		DIsplayInterfaceClass di =new DIsplayInterfaceClass();
		di.display();
		
		Interface1 i1=di;
		i1.display();
		
		Interface1 i2=di;
		i2.display();
		
		CalculatorInterface.getDeveloperInfo();
		//CalculatorInterface ci=new SciFicCalcClass();
		//ci.getDeveloperInfo(); //not possible
		
		
		
		
		
		
		
		
		

	}

}
