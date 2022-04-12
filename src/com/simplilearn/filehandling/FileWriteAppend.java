package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriteAppend {

	public static void main(String[] args) {
		
		// writeFile("filedata.txt", "Today is wonderful day!");		
		 // appendFile("data.txt", "Today is gooday day!");
		
		// writeFileFOS("dbdata.txt", "Today is gooday day!");
		appendFileFOS("dbdata.txt", "\nToday is wonderful day!");
		appendFileFOS("dbdata.txt", "\nToday is Tuesday!");
	}

	// Write data as character stream  : override data from file
	private static void writeFile(String filename, String data) {
		try {
			FileWriter fileWriter = new FileWriter(new File(filename));
			fileWriter.write(data);
			fileWriter.close();
			System.out.println("File Write Operation is completed !");
		} catch (Exception e) {
			System.out.println("File Write Operation is failed !");
		}
	}
	
	// Append data as character stream  : add data end of the line
	private static void appendFile(String filename, String data) {
		try {
			FileWriter fileWriter = new FileWriter(new File(filename), true);
			fileWriter.append("\n" +data);
			fileWriter.close();
			System.out.println("File Append Operation is completed !");
		} catch (Exception e) {
			System.out.println("File Append Operation is failed !");
		}
	}
	
	// Write data as byte stream
	private static void writeFileFOS(String filename, String data) {
		try {
			FileOutputStream out = new FileOutputStream(filename);
			// write data with out put stream
			out.write(data.getBytes());
			out.close();
			System.out.println("File Write Operation is completed !");
		} catch (Exception e) {
			System.out.println("File Write Operation is failed !");
		}
	}
	

	// Append data as byte stream
	private static void appendFileFOS(String filename, String data) {
		try {
			FileOutputStream out = new FileOutputStream(filename, true);
			// write data with out put stream
			out.write(data.getBytes());
			out.close();
			System.out.println("File Append Operation is completed !");
		} catch (Exception e) {
			System.out.println("File Append Operation is failed !");
		}
	}
	
}
