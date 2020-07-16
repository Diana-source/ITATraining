package com.ita.training.java.string;

public class StringSamplePrograms {
	
	public static void main(String[] args)
	{
		
		String str1 = "Hello all how are you doing";
		replaceAllChar(str1, "o", "O");
		
	}
	
	public static void replaceAllChar(String str, String from, String to)
	{
		str = str.replaceAll(from, to);
		System.out.println(str);
}
		

	}
	


