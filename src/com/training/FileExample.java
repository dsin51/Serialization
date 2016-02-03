package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {
	public static void main(String args[]) {
		File f = new File("Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PrintWriter writer = new PrintWriter(f);
			writer.println("Hello");
			writer.close();
		} catch (FileNotFoundException e) {System.out.println(e.getMessage());}
		System.out.println(f.exists());
	}
}
