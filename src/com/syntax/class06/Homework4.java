package com.syntax.class06;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
	   /* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, 
		* discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		  After discount ___ the price of the item reduce from __ to ___
		* Please complete this assignment in 2 ways: using if statement and switch case*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Is there sale today");
		String sale = input.next();
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What item would you like to buy?");
			String item = input.next();
			
			System.out.println("What is the price of the item");
			double price = input.nextDouble();
			
			
			
		}
		
	}

}
