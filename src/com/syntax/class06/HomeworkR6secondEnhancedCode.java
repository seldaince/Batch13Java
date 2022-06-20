package com.syntax.class06;

import java.util.Scanner;

public class HomeworkR6secondEnhancedCode {

	public static void main(String[] args) {
		// Enhanced coding example

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter quiz score");
		int quizScore = scan.nextInt();
		System.out.println("Please enter mid term score");
		int midScore = scan.nextInt();
		System.out.println("Please enter final score");
		int finalScore = scan.nextInt();

		int average = (quizScore + midScore + finalScore);
		char grade;

		if (average >= 90) {
			grade = 'A';
			
		} else if (average >= 70 && average < 90) {
			grade = 'B';
			
		} else if (average >= 50 && average < 70) {
			grade = 'C';
			
		} else {
			grade = 'F';
		}

		System.out.println("Your grade is " +grade+ " student");
		
		/* if you are A or B student ---> you are doing great
		 * otherwise --> please try to study more*/
		
		if(grade=='A' || grade=='B') {
			System.out.println();
		}else {
			System.out.println("Please try to studey more30");
		}
	}

}
