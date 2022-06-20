package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		/* create an array of chars and store grades into it:A,B,C,D,E,F,
		 * Then print a grade b 
		 * use 2 different ways of creating an array
		 */
		
		 //example 1
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		
		System.out.println(grades[1]);
		
		//example 2
		char [] grade2= {'A','B','C','D','F',} ;
		System.out.println(grade2 [1]);
	}

}
