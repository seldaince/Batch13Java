package com.syntax.class05;

import java.util.Scanner;

public class Homework3second {

	public static void main(String[] args) {

		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number of worked years");
		int years = scan.nextInt();

		if (years >= 5) {
			System.out.println("You are eligble for bonus");

			System.out.println("Please enter your annual salary");
			int wage = scan.nextInt();

			if (wage > 50000) {
				System.out.println("You get a 5000 bonus");
			} else if (wage <= 50000) {
				System.out.println("You get a 3000 bonus");

			}

		} else {
			System.out.println("You don't get any bonus");

		}

	}

}
