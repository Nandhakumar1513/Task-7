package com.guvi7;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		 // Create a List of strings
	    List<String> list = new ArrayList<>();
	    list.add("Apple");
	    list.add("Banana");
	    list.add("Cherry");
	    list.add("Date");
	    list.add("Elderberry");
	    System.out.println("List: \n" +list);
	    

	    // Convert the List to an array
	    String[] array = list.toArray(new String[0]);

	    // Print the array
	    System.out.println("Array:");
	    for (String element : array) {
	      System.out.println(element);
	    }
	  }
	}
