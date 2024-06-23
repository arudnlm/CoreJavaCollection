package com.coreJava;

import java.util.Scanner;

public class ClientCodeForSimpleSI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		float amount = scanner.nextFloat();

		System.out.println("Enter the rate: ");
		float rate = scanner.nextFloat();

		System.out.println("Enter the time: ");
		int time = scanner.nextInt();
		scanner.close();
		ISimpleIntrestImpl iSimpleIntrestImpl = new ISimpleIntrestImpl();
		iSimpleIntrestImpl.calculateSimpleIntrest(amount, rate, time);

	}

}
