package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter loan amount needed");

		int loan = scan.nextInt();

		if (loan <= 200000) {
			System.out.println("Your loan has been approved");

		} else {
			System.out.println("Your application has been rejected");
		}
	}

}
