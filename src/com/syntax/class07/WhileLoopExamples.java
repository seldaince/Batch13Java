package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {

		// print number from 1 to 10;

		int num = 1;

		while (num <= 10) {

			System.out.print(num + " ");
			num++;
		}

		// print number from 1 to 10;
		System.out.print(num);

		int num1 = 0;

		while (num1 <= 10) {
			num1++;
			System.out.println(num + " ");
			num++;

			// print number from 1 to 10;
			System.out.println();

			int a = 10;

			while (a <= 100) {
				System.out.println(a + " ");
				a++;
			}

			// print number from 100 to 50;

			int c = 100;

			while (c >= 50)
				;
			System.out.print(c + " ");

		}
	}
}
