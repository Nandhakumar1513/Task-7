package com.guvi7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    int num1, num2;

	    try {
	      System.out.print("Enter the first integer: ");
	      num1 = scanner.nextInt();

	      System.out.print("Enter the second integer: ");
	      num2 = scanner.nextInt();

	      if (num2 == 0) {
	        throw new ArithmeticException("Cannot divide by zero!");
	      }

	      int result = num1 / num2;
	      System.out.println("The result of the division is: " + result);
	    } catch (InputMismatchException e) {
	      System.out.println("Error: Invalid input. Please enter integers only.");
	    } catch (ArithmeticException e) {
	      System.out.println("Error: " + e.getMessage());
	    }
	  }

	}
