package com.guvi7;

import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
		// Create a TreeMap to store employee IDs and names
	    TreeMap<Integer, String> employeeMap = new TreeMap<>();

	    // Add some employees to the map
	    employeeMap.put(101, "John Doe");
	    employeeMap.put(102, "Jane Smith");
	    employeeMap.put(103, "Bob Johnson");
	    employeeMap.put(104, "Alice Brown");
	    employeeMap.put(105, "Mike Davis");

	    // Create a TreeMap to store employee names in alphabetical order
	    TreeMap<String, Integer> nameMap = new TreeMap<>();
	    for (Integer id : employeeMap.keySet()) {
	      String name = employeeMap.get(id);
	      nameMap.put(name, id);
	    }

	    // Print the names of all employees in alphabetical order
	    System.out.println("Employee Names in Alphabetical Order:");
	    for (String name : nameMap.keySet()) {
	      System.out.println(name);
	    }
	  }
	}
