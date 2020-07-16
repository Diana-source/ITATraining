package com.ita.training.java.interfaces;

public class MyClass implements Test1, Test2
{
	
	private static final char[] MAX_MARKS = null;

	public void test2() {
		System.out.println(MAX_MARKS);
		
	}

	
	public void test1() {
		System.out.println(MAX_MARKS);
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.test1();
		m.test2();
		
		
	}
}
