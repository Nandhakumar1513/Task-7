package com.guvi7;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter your age: ");
		    int age = scanner.nextInt();

		    try {
		      validateAge(age);
		      System.out.println("You are eligible to vote!");
		    } catch (InvalidAgeException e) {
		      System.out.println("Error: " + e.getMessage());
		    }
		  }

		  public static void validateAge(int age) throws InvalidAgeException {
		    if (age < 18) {
		      throw new InvalidAgeException("You must be at least 18 years old to vote.");
		    }
		  }

	}


