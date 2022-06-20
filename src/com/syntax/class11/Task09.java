package com.syntax.class11;

public class Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] arr= {10,20,50,5,8};
		
		int maxNumber=arr[0];
		int minNumber=arr[0];
		
		for(int num:arr) {
			
			if(num>maxNumber) {
				maxNumber=num;
			}
			if(num<minNumber) {
				minNumber=num;
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(minNumber);
		
		
		/* Another Example

				int[] num = { 2531, 4651, 761, 6471 };

				int i;
				int max = num[0];
				int min = num[0];

				for (i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];

					}
					if (num[i] < min) {
						min = num[i];
					}
				}
				System.out.println(min);
				System.out.println(max);*/
		
		
	}
	

}
