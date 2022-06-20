package com.syntax.class08;

import java.util.Scanner;

public class TaskSecretNumber {

	public static void main(String[] args) {
		/* declare a secret number
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number
		 * gets the secret number -> you got it
		 * */
		
		Scanner scan=new Scanner(System.in);
		
		int secretNumber=19;
		int num;
		
		do {
		System.out.println("Please guess my secret number");
		num=scan.nextInt();
		
		}while(num!=secretNumber);{
		
		System.out.println("You got it!");
	}
		
	}

}
