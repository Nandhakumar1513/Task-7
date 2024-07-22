package com.guvi7;

public class Exceptions {

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
	    String str = "hello";

	    try {
	      System.out.println(array[3]); // throws ArrayIndexOutOfBoundsException
	      
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("Error: Array index out of bounds.");
	    } 
	    
	    try{
	    	System.out.println(str.charAt(5)); // throws StringIndexOutOfBoundsException
	    }
	    	catch (StringIndexOutOfBoundsException e) {
	    }
	      System.out.println("Error: String index out of bounds.");
	    }
	  }

