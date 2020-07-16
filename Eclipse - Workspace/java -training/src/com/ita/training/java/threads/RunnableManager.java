package com.ita.training.java.threads;

public class RunnableManager {
	
	public static void main(String[] args) throws InterruptedException {
		
		OddNumberRunnable od = new OddNumberRunnable();
		EvenNumberRunnable ev = new EvenNumberRunnable();
		
		Thread t1 = new Thread(od);
		Thread t2 = new Thread(ev);
		
		t1.start();
		t2.start();
		
		for (int i = 1; i < 50; i++)
		{
			System.out.println("#############------------" + i);
			Thread.sleep(100);
		}
	}

}
