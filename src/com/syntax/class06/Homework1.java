package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * Please complete this assignment in 2 ways: using if statement and switch case*/
		
		// If Statement
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter your country");
	String country = input.next();
	
	if(country.equals("Turkey")){
			System.out.println("You speak Turkish");
		
		}else if(country.equals("Germany")) {
			System.out.println("You speak German");
		
		}else if(country.equals("France")) {
			System.out.println("You speak French ");
		
		}else if(country.equals("Italy")) {
			System.out.println("You speak Italian");
			
		}else if(country.equals("Pakistan")) {
			System.out.println("You speak Urdu");
			
		}else {
			System.out.println("Invalid country");
		}
	input.close();
	}
}
