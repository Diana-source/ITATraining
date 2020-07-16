package com.ita.training.java.threads;

public class OddNumberRunnable implements Runnable
{

	public void run() {
		System.out.println("------Odd NUmbers----");
		for (int i = 1; i < 50; i=i+2)
		{
			System.out.println("00000000000000000000-----------" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
