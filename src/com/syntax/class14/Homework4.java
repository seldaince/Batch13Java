package com.syntax.class14;

public class Homework4 {

	public static void main(String[] args) {
		
		String s=new String("haahhaha");
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jajajja");
		System.out.println(st.reverse());
		//String and StringBuilder both are classes that we can use to store and manipulate characters
		//but String is immutable and StringBuilder is mutable
		//when we make a lot of changes to a String it creates multiple copies inside your memory and
		//because of this reason because for every change a new variable is created
	}

}
