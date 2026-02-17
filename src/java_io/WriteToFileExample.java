package java_io;

import java.io.FileWriter;

import java.io.BufferedWriter;

import java.io.IOException;

public class WriteToFileExample {

	public static void main(String[] args) {

// Specify the file name

		String fileName = "output.txt";

		String c = "Hello,"
				+ "BCA Third Semester!";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

			writer.write(c);

			System.out.println("Text successfully written to " + fileName);

		} catch (IOException e) {

			System.err.println("An error occurred while writing to the file: " + e.getMessage());

		}

	}

}
