package com.ita.training.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("data\\temp.txt");
		String str = "My Java";
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(str.getBytes());
			fos.close();
		}
		System.out.println("DONE");
		
	}
}
