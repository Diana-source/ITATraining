package com.ita.training.java.generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++)
		{
			al.add(2*i);
		}
		
		System.out.println(al.size());
		
		for (Integer value : al) {
			System.out.println("--------Printing Values-----");
            for (Integer value : al) {
            	System.out.println(value);
            }
		
		
		}
	}

}
