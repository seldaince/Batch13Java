package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// create an array
		
		int []b=new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=75;
		b[2]=100;
		
		// access values from my array
		System.out.println(b[2]);//70
		System.out.println(b[1] +b[3]); //185
		
		//We need to create an array of my classmates name
		//when we create an array we MUST specify the size (how many
		String[] classMates= new String [5];
		// how values 
		classMates[0]="Khrystyna";
		classMates[1]="Zameer";
		classMates[2]="Elexia";
		classMates[3]="oleg";
		classMates[4]="adem";
		
		System.out.println("My classmate name is "+classMates[3]);
	}


}
