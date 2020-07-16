package com.ita.trainig.java.access_specifiers;

class Person {
	String name;
	String phoneNum;
	double height;
	double weight;
	int age;
	String country = "India";
	
	String lives = "Earth";
	

    static void test() {
    	
		System.out.println("Hello person!!! lives on Earth");
	}

}

public class PersonManager {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "Aravinda";
		p2.name = "Ravi";
		p1.country = "USA";

		System.out.println(p1.name);
		System.out.println(p2.name);
		
		Person.test();		

	}

}
