package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with
		 * explanation.
		 * Please complete this assignment in 2 ways: using if statement and switch case*/

		//If Statement
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = input.next();
		
		if (grade.equals("A")){
			System.out.println(grade+" grade is Excellent");
		
			}else if (grade.equals("B")){
			System.out.println(grade+" grade is Good");
		
			}else if (grade.equals("C")){
			System.out.println(grade+" grade is Average");
			
			}else if (grade.equals("D")){
			System.out.println(grade+" grade is Bad");
			
		}else {
			System.out.println("Not acceptable grade");
		}		
		input.close();
}
		
	}

