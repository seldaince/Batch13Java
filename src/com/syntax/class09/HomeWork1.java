package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it.
		 * Using 2 different loops print all values from the array.
		 */

		String[] cars = new String[6];

		cars[0] = "Audi";
		cars[1] = "Murat";
		cars[2] = "Sahin";
		cars[3] = "Dogan";
		cars[4] = "Serce";
		cars[5] = "Kartal";

		for (int i = 0; i < cars.length; i++) {

			System.out.println(cars[i]);
		}
		
		System.out.println("---Another Way---");

		String[] cars1 = { "Audi", "Murat", "Sahin", "Dogan", "Serce", "Kartal" };
						//	 0 		  1 		2 		3 		4 		5

		for (String car : cars1) {

			System.out.print(car + " ");
		}
	}

}
