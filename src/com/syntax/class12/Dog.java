package com.syntax.class12;


public class Dog {

		/*
		 * Create a Dog Class and create 3 different objects of it: Husky, 
		 * Bulldog, Labrador with specific attributes and behaviors.
		 */
		
		String name;
		String color;
		String breed;

		void bark() {
			System.out.println("The dog can bark");
		}

		void run() {
			System.out.println("The dog can run ");
		}

		void play() {
			System.out.println("The dog can play");

		}

		public static void main(String[] args) {
		
			Dog Husky = new Dog();
			Husky.name = "Husky";
			Husky.color = " Brown";
			Husky.breed = "a";
			Husky.bark();
			System.out.println("The dog "+Husky.name+" is"+Husky.color);
			
			Dog Bulldog = new Dog();
			Bulldog.name = "Bulldog";
			Bulldog.color = "Black";
			Bulldog.breed = "b";
			Bulldog.run();
			System.out.println("The dog "+Bulldog.name+" is "+Bulldog.breed+" breed");
			
			Dog Labrador = new Dog();
			Labrador.name = "Labrador";
			Labrador.color = "Ginger";
			Labrador.breed = "c";
			Labrador.play();
			System.out.println("The dog "+ Labrador.name+" is "+Labrador.color);
		
	}

}
