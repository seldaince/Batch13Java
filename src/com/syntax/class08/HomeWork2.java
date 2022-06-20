package com.syntax.class08;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String item;
		double price;
		double money;
		double reminder;
		double sum=0;
		
		System.out.println("Please enter the item you want to buy");
		item=input.next();
		
		System.out.println("Please enter the item price");
		price=input.nextDouble();
		
		do {
			System.out.println("Please pay for the "+item);
			money=input.nextDouble();
		
			sum+=money;
			
			if (sum>price) {
				
				double change=sum-price;
				System.out.println("Your change is "+change);
				break;
				
			}else if (sum<price) {
				
				reminder=price-sum;
				System.out.println("Please pay "+reminder +" more");
				
			}else {
				System.out.println("You got the right amount");
			}
		
		}while (sum!=price);
		
		System.out.println("Thank you for shopping");
		
	}
	
}
