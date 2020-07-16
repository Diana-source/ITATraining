package com.ita.training.java.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data\temp.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file,true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Buffered writer is easy to use");
		bw.newLine();
		bw.write("cool to use");
		
		bw.close();
		fw.close();
		System.out.println("done");
		
	}

}
