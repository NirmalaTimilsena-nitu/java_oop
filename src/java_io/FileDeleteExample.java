package java_io;

import java.io.File;

public class FileDeleteExample {

	public static void main(String[] args) {

// Specify the file to be deleted
		File file = new File("example.txt");
// Attempt to delete the file

		if (file.delete()) {
			System.out.println("File deleted successfully: " + file.getName());

		} else {
			System.out.println("Failed to delete the file: " + file.getName());

		}

	}

}
