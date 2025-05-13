package JavaTask07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class EmployeeMap {

	 public static void main(String[] args) {
	        
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();     // Create a TreeMap of employee IDs and names

	        // Add some employee entries 
	        employeeMap.put(103, "Pratik");
	        employeeMap.put(101, "Sanket");
	        employeeMap.put(104, "Rahul");
	        employeeMap.put(102, "Mohan");

	       
	        List<String> names = new ArrayList<>(employeeMap.values());    

	       
	        Collections.sort(names);                                    // Sort names alphabetically

	                                                                   
	        System.out.println("Employee names in alphabetical order:");        // Print sorted names
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}