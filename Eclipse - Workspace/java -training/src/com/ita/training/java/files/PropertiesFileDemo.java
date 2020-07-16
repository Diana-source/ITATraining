package com.ita.training.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Properties;

public class PropertiesFileDemo {
	
	public static void main(String[] args) throws FileSystemException {
		
		File file = null;
		FileInputStream fis = null;
		file = new File("data\\globaldata.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Properties props = new Properties();
		
		
		try {
			props.load(fis);
			System.out.println(props.getProperty("Name"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
