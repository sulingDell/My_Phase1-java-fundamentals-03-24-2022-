package com.simplilearn.filehandling;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		deleteFile("data.txt");
	}
	
	private static void deleteFile(String filename) {
		try {
			File file = new File(filename);
			boolean response = file.delete();
			if(response) {
				 System.out.println("File deleted successfully");
			} else {
				 System.out.println("Failed to delete the file");
			}
		} catch (Exception e) {
			 System.out.println("Failed to delete the file");
		}
	}
}
