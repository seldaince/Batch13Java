package com.syntax.class02;
 
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	//Part a
		String name= "Selda"; 
		String lastName= "Ince";
		char grade= 'A'; 
		String city= "Dallas"; 
		String state= "Texas";
		long phoneNumber= 1234567890l;
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
	    System.out.println("I live in city "+city+" and state " +state);
	    System.out.println("And my phone number is "+phoneNumber);
	
		//Part b
	    city="Olympia";
	    state="Washington";
	    phoneNumber= 9876543210l;
	    grade='B';
		
	    System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+". My new phone number is "+phoneNumber);
	}

}
