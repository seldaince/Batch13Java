package com.syntax.class09;

public class MoreNestedLoops {

	public static void main(String[] args) {
		// how to create a multiplication table
		
		for (int x=1; x<=10; x++) {
			
			for (int y=1; y<=10; y++) {
				
				System.out.println(x+ " x "+y+" = "+(x*y));
			}
			System.out.println("-------------");
		}
	}

}
