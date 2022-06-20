package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Have you worked 5 or more years ");
		boolean yearswork = scan.nextBoolean();

		if (yearswork == true) {
			System.out.println("What is your salary");

			int salary = scan.nextInt();

			if (salary > 50000) {
				System.out.println("You get a 5000 bonus");
			} else if (salary <= 50000) {
				System.out.println("You get a 3000 bonus");
			}

		} else {
			System.out.println("You don't get any bonus");

		}

	}
}