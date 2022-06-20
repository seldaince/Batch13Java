package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// String class
		
		String str="where is sameer?";
		System.out.println(str.charAt(3));//indexs starts with 0 
		System.out.println(str.charAt(5));// if typed - number it will give out of bounds error/ it also print space
		System.out.println(str.indexOf("i")); //it shows the index number of "i"
		System.out.println(str.indexOf("e")); //if you have more 1 e it will only give the first index number
		System.out.println(str.indexOf("e",6));//number shows where we want to start count the e/ignores the 0-5 index number
		
		int counter=0;
		for(int i=0; i<str.length();i++) {
		if(str.charAt(i)=='e') {
			counter++;
			if(counter==4) {
				System.out.println(i);
			}
		}
	}
	}

}
