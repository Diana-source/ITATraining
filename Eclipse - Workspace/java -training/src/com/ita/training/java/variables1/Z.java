package com.ita.training.java.variables1;

public class Z extends A

{

	public static void main(String[] args) {
	
		Z z1 = new Z();
		System.out.println("Protected memebr of class A" + z1.protectedVariable);
		System.out.println("Public member of class A" + z1.publicVariable);
		
		z1.test3();
		z1.test4();
}

}