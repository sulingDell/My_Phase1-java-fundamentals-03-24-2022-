package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFileDemo {

	public static void main(String[] args) {

		readFile("dbdata.txt");
		System.out.println();
		System.out.println("------------------------");
		readFileFIS("filedata.txt");
	}

	// Read by character stream
	private static void readFile(String filename) {
		try {
			FileReader fileReader = new FileReader(new File(filename));
			// int c = fileReader.read();
			// System.out.println((char) c);
			int c = 0;
			while ((c = fileReader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			System.out.println("File Read Exception !");
		}
	}

	// Read by byte stream
	private static void readFileFIS(String filename) {
		try {
			FileInputStream fileStream = new FileInputStream(new File(filename));
			// int c = fileReader.read();
			// System.out.println((char) c);
			int c = 0;
			while ((c = fileStream.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			System.out.println("File Read Exception !");
		}
	}
}
