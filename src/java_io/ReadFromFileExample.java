package java_io;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFromFileExample {

	public static void main(String[] args) {

// Specify the file to be read

		File file = new File("output.txt");

		try (Scanner scanner = new Scanner(file)) {

// Read and print each line from the file

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();

				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		}

	}

}
