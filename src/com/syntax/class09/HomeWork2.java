package com.syntax.class09;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */

		String [] animal =new String [5];
				
			animal [0]="Cat";
			animal [1]="Dog";
			animal [2]="Bird";
			animal [3]="Horse";
			animal [4]="Fish";
			
		for (String a:animal) {
			System.out.println(a);
		}
		
		System.out.println("---Another Way---");
		
		String[] animals= {"Cat","Dog","Bird","Horse","Fish"};
		
		for (int b = 0; b<animals.length; b++){
	
		System.out.print(animals[b]+" ");
		}
			
}
}

