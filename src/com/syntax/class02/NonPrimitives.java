package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		String lastName="Smith";
	
		long phone=1234567890l;
		 
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		String address="123 Washington str";
		 
		String age= "30"; 
		String city="Miami";
		city = "Los Angles";
		//shortcut for printing
		//type syso +ctrl+space --> hit enter
		
		/*we can use + 
		 *             to attach String to String
		 *             to attach String to int
		 *             to attach String to double
		 *             to any other type
		 */
		System.out.println(name+" "+lastName); // Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+"lives in "+city);
		
		//Oleg is 30 years old
		
		String words="years old";
		System.out.println(name+ " is " +age+" years old");
			
		
	}
	

}
