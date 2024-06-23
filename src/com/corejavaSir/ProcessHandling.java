package com.corejavaSir;

public class ProcessHandling {

	public void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("The given number " + num + " is Even number.");
		} else {
			System.out.println("The given number " + num + " is Odd number.");
		}

	}

	public void checkLeapYear(int num) {
		if (num % 100 == 0 && num % 400 == 0) {
			System.out.println("Passed year is a leap year.");
		} else if (num % 100 != 0 && num % 4 == 0) {
			System.out.println("Passed year is a leap year.");
		} else {
			System.out.println("Passed year is not a leap year.");
		}

	}

	public void checkLargestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("The given number " + num1 + " is largest number.");
		} else if (num2 > num3) {
			System.out.println("The given number " + num2 + " is largest number.");
		} else {
			System.out.println("The given number " + num3 + " is largest number.");
		}

	}

}
