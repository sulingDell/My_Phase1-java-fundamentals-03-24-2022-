package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {

	public static void main(String[] args) {
		copyFile("dbdata.txt","file-copy-data.txt");
	}

	private static void copyFile(String source, String destn) {
		try {
			
			FileInputStream input = new FileInputStream(new File(source));
			FileOutputStream output = new FileOutputStream(new File(destn));
			
			int c = 0;
			while ((c = input.read()) != -1) {
				output.write(c);
			}
			System.out.println("File is copied successfully!");
		} catch (Exception e) {
			System.out.println("Failed to copy a File");
		}
	}
}
