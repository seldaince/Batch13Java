package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		// Loop inside another loop

		for (int i = 1; i <= 5; i++) { //outer loop
			
			System.out.println("Hello");


			for (int y = 1; y <= 3; y++) {// nested loop
				
				System.out.println("Bye");

			}
			
		}
		
		System.out.println("--------------");
		
		
	}
	
}
