package JavaTask07;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>(); // Create a list of strings
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		// Convert the list to an array
		String[] fruitArray = fruits.toArray(new String[0]);

		// Print the array elements
		System.out.println("Array elements:");
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}
	}
}
