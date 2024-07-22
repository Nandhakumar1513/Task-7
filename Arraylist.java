package com.guvi7;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

	    // Add some elements to the ArrayList
	    list.add("Apple");
	    list.add("Banana");
	    list.add("Cherry");
	    list.add("Date");
	    list.add("Elderberry");

	    System.out.println("Original ArrayList: " + list);

	    // Remove all elements from the ArrayList
	    list.clear();
	    
	    System.out.println("After removing all the elements :" +list);	    		
	    	}
	    	
	}
