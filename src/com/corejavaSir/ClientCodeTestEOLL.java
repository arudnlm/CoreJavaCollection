package com.corejavaSir;

import java.util.Scanner;

public class ClientCodeTestEOLL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check even or odd:  ");
		int num = scanner.nextInt();
		ProcessHandling processHandling = new ProcessHandling();
		processHandling.checkEvenOdd(num);

		System.out.println("Enter the year only yyyy formate to check leap year:  ");
		int num1 = scanner.nextInt();
		processHandling.checkLeapYear(num1);

		System.out.println("Enter the three number to check largest number:  ");
		System.out.println("Enter the 1st number:  ");
		int num3 = scanner.nextInt();
		System.out.println("Enter the 2nd number:  ");
		int num4 = scanner.nextInt();
		System.out.println("Enter the 3rd number:  ");
		int num5 = scanner.nextInt();

		processHandling.checkLargestNumber(num3, num4, num5);
	}

}
