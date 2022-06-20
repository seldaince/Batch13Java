package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("Driving license will be issued");
		} else {
			System.out.println("Please get a learners permit");
		}
	}

}
