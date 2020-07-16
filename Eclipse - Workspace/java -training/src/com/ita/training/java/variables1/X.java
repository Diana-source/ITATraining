package com.ita.training.java.variables1;

public class X {
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
//		System.out.println("Private member of class A ->" + a1.privateVariable);
		
		a1.publicVariable = 200;
		System.out.println("after changing " + a1.publicVariable );
			
	}		
		
}
