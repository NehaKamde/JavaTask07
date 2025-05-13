package JavaTask07;

import java.util.ArrayList;


public class ArrayList1{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display the original list
        System.out.println("Original ArrayList: " + fruits);

        // Remove all elements from the list
        fruits.clear();

        // Display the list after clearing
        System.out.println("ArrayList after removing all elements: " + fruits);
    }
}