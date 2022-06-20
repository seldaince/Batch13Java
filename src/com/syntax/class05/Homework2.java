package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city");
		String city = scan.next();

		System.out.println("Please enter the temperature");
		int temp = scan.nextInt();

		int celcius = (temp - 32) * 5 / 9;

		System.out.println("The temperature in the city is " + city + " is " + celcius);

	}

}
