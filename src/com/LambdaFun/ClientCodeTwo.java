package com.LambdaFun;

public class ClientCodeTwo {
	public static void main(String[] args) {
		SecondDemo secondDemo = new SecondDemo();
		
		int largestNumber = secondDemo.largestNumber(20, 33, 45);
		System.out.println("The Largest Number among three number is :>>>  "+largestNumber);
	}

}
