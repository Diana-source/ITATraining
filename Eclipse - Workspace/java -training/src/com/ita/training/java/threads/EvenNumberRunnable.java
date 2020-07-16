package com.ita.training.java.threads;

public class EvenNumberRunnable implements Runnable
{
	
	public void run() {
		System.out.println("------Odd NUmbers----");
		for (int i = 0; i < 50; i=i+2)
		{
			System.out.println("EEEEEEEEEEEEE-----------" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

}
