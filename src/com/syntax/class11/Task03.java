package com.syntax.class11;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		
		int [][] arr = { {10,15,10},
					   {20,50,20},
					   {30,30,30,60}};
		
		/*System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);*/
		
		/*for (int j=0; j<3; j++) {
		
			for (int i=0;i<3;i++) {
			System.out.println(i);
		}
					
	}			*/
		int sum=0;
		for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				sum=sum+arr[j][i];
			}
			
		}
		System.out.println(sum);
		
	}
	
}
