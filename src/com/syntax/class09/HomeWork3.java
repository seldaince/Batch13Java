package com.syntax.class09;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then 
		 * print all elements using 2 different loops
		 */
							// below are the elements
		double[] numbers = { 15.50, 17.99, 19.50, 22.99 };
// always starts with (0) 		0 	  1 	 2 		3
							
					// Length counts the elements  
		for (int i = 0; i < numbers.length; i++) {
		 //*Initialisation  *condition	*incrimentation
			
			System.out.println(numbers[i]);
		}

		System.out.println("---Another Way---");

		for (double num : numbers) {
			System.out.println(num);
		}
	}
}
