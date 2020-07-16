package com.ita.training.java.exceptions;

public class ExceptionsDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("--main started--");
		try 
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Exception occured while waiting");
		}
		
		
		System.out.println("---main ended--");
		
	}

}
