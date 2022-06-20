package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		/*1.Write a program to store a value whether user has diploma or not.
		  If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		  Then if user has a degree program should check a gpa score.
		  If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		  
		  2.Create a Java program and store values of mortgage rate and mortgage price. 
		  First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
		  Once user decides to buy a house, if price of the house is larger than 50000 than user will take a loan, otherwise user will pay cash.*/
	
		boolean haveDiploma=true;
		double gpa=3.8;
				
		if (haveDiploma) {
			System.out.println("congratulations");
			
			if (gpa>3.5) {
				System.out.println("you are eligible for scholarship");
			}else {
				System.out.println("you should have studied harder");
			}
		}else {
			System.out.println("get a degree");
		}
	
		System.out.println("--------------------");
		
		int price=500000;
		int rate=6;
		
		if (rate>4.5) {
			System.out.println("You will not buy house");
		}
	
	}

	
	
	
}
