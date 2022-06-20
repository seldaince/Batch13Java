package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. 
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner input =new Scanner (System.in);
		System.out.println("Please enter 1st number");
		int num1 = input.nextInt();
		
		System.out.println("Please enter 2nd number");
		int num2 = input.nextInt();
		
		System.out.println("Please enter operator");
		String operator = input.next();
		double outcome=0.0;
		
		if (operator.equalsIgnoreCase("+")) {
			outcome = num1+num2;
			
			}else if (operator.equalsIgnoreCase("-")) {
			outcome = num1-num2;
			
			}else if (operator.equalsIgnoreCase("*")) {
			outcome = num1*num2;
			
			}else if (operator.equalsIgnoreCase("/")) {
			outcome = num1/num2;
		}else {
				System.out.println("Invalid operator");
		}

			System.out.println("The result of the outcome is " + outcome);
	}
	
	}
