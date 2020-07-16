package com.ita.training.java.exceptions;

import java.util.Scanner;

public class BankingApp {

	static double balance = 5000;
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int withdraw = 0;
		double tempbalance = 0;
		
	String choice;
	do {
      
		System.out.println("Enter the amount you want to withdraw");
		withdraw = sc.nextInt();
		tempbalance = balance - withdraw;
		if(tempbalance <=0)
		{

		try {
			throw new BalanceInsufficientException(balance);
		} catch (Exception e) {
			System.out.println(
					"your balance is too low to make this transaction," + "Please withdraw with in " + balance);
		} finally {
			System.out.println("finally executed");
		}
	}

	System.out.println("current balance"+"balance");
	System.out.println("Do you want to continue...? yes/no ");
	
	choice = sc.next();
	}while(choice.equalsIgnoreCase("yes"));
	
	System.out.println();
		
		
		
		
	

		}
    }
