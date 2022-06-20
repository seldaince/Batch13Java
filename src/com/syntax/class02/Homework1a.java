package com.syntax.class02;

public class Homework1a {

/*Write a Java program to add, subtract, multiply and divide 2 decimal values.
 *  Your program should say. 
 * “The _______ of 2 numbers ___ and ___ is equal to _____”
 */
	public static void main(String[] args) {
		  
	double num1 = 8.0;
	double num2 = 1.2;
	double sum = num1+num2;
	double substract = num1-num2;
	double multiply = num1*num2;
	double divide = num1/num2;
	
	System.out.println("The addition of 2 numbers "+num1+ " and "+num2+ " is equal to "+sum);
	System.out.println("The substraction of 2 numbers "+num1+ " and "+num2+ " is equal to "+substract);	
	System.out.println("The multiplication of 2 numbers "+num1+ " and "+num2+ " is equal to "+multiply);
	System.out.println("The division of 2 numbers "+num1+ " and "+num2+ " is equal to "+divide);
	
	}

}
