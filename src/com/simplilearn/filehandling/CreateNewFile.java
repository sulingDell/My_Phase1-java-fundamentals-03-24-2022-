package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;

public class CreateNewFile {

	public static void main(String[] args) {
		// caller methods
		// createNewFile("filedata.txt");
		
		createNewFileFOS("dbdata.txt");
	};
	
	//Create a file using java.io.File class
	private static void createNewFile(String filename) {
		try {
			File file = new File(filename);
			// create file
			boolean response = file.createNewFile();
			
			if(response) {
				System.out.println("--- File is created ! ---");
			}else{
				System.out.println("--- File already exist ! ---");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured "+e.getMessage());
			System.out.println("File already exist !");
		}
	}
		
	//Create a file using FileOutputStream class
	private static void createNewFileFOS(String filename) {
		try {
			File file = new File(filename);
			FileOutputStream out = new FileOutputStream(file);
			System.out.println("--- File is created ! ---");
			out.close();
		} catch (Exception e) {
			System.out.println("--- File already exist ! ---");
		}
	}
}

