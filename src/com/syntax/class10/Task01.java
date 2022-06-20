package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		int largestNumber=numbers[0];
		
		for (int i=0; i<numbers.length;i++) {
			
			if (numbers [i] >largestNumber){
				largestNumber = numbers [i];
			}
		
		System.out.println("The largest number is " +largestNumber);
			
		}
	}
}
// need to work on this