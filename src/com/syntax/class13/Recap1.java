package com.syntax.class13;

public class Recap1 {

	public static void main(String[] args) {
		// String class

		String str="Batch 13 is great but i say this to every batch. i was kidding";
		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();// use this to reassign so it will continue using the same way upper class
		System.out.println(str);
		str=" ";//if reassign it will be true because str is reassign to empty space
		System.out.println(str.isEmpty()); //other wise false because str has a value
		
		String str2=" Tara               ";
		System.out.println(str2.trim());// trims spaces
		str="Batch 13 is great but i say this to every batch. i was kidding";
		System.out.println(str.contains("batch"));// checks if the word contains the specific word true/false
		System.out.println(str.startsWith("Batch"));// if it starts with that specific word true/false
		System.out.println(str.endsWith("ing"));// if it ends with the specific word true/false
	}

}
