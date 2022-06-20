package com.syntax.class12;

public class Phone {

		/*
		 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, 
		 * Samsung with specific attributes and behaviors.
		 */
	
	String name;
	int model;
	String color;
	int storage;
	
	void ringtone () {
		System.out.println("The phone is ringing");
		
	}void camera (){
		System.out.println("The phone takes pictures ");
	
	}void message (){
		System.out.println("The phone sends and receives messages");
	}
	
	public static void main(String[] args) {
		
	Phone iphone = new Phone ();
	iphone.name = "Iphone";
	iphone.model = 12;
	iphone.color = "Black";
	iphone.storage = 256;
	iphone.ringtone();
	
	System.out.println("The phone "+iphone.name +" "+ iphone.model+" has "+iphone.storage+" storage");
	System.out.println("------------------");
			
	Phone pixel = new Phone ();
	pixel.name = "Pixel";
	pixel.model = 10;
	pixel.color = "Pink";
	pixel.storage = 32;
	pixel.camera();		
			
	System.out.println("The phone "+pixel.name+" is "+pixel.color);
	System.out.println("------------------");	
		
	Phone samsung = new Phone ();
	samsung.name = "Samsung";
	samsung.model = 20;
	samsung.color = "Grey";
	samsung.storage = 64;
	samsung.message();	
	
	System.out.println("The phone "+samsung.name+ " "+samsung.model+ " is " +samsung.color);
	}

}
