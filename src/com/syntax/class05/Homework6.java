package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * 
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */

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
		} else if (average < 50) {
			grade = 'F';
		} else {
			grade = ('E');
		}

		System.out.println("Your grade is " + grade + " and your average is " + average);
	}

}
