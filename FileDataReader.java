package com.guvi7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDataReader {

	public static void main(String[] args) {
		try {
			readFile("hloo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (!file.exists()) {
			throw new FileNotFoundException("The file '" + fileName + "' does not exist.");
		}

		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	}

}

