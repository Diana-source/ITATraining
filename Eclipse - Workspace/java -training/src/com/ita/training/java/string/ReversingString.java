package com.ita.training.java.string;

public class ReversingString {
	
	public static void main(String[] args) 
	{
		
		String str = "Hello All how are you doing today???";
		
		
		for (int i = str.length()-1; i >=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
