package JavaTask07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {
		try {

			File file = new File("sample.txt"); // Attempt to read from a file
			Scanner reader = new Scanner(file);

			System.out.println("Reading file content:");
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}

			reader.close();
		} catch (FileNotFoundException e) {
			// Handle file not found exception
			System.out.println("Error: File not found.");
		}
	}
}
