package com.FunctionInterface;

public class ClientCodeforDemoThreeFI {

	public static void main(String[] args) {
		DemoThreeFI demoThreeFi= (int num1, int num2)->{
			int sum= num1+num2;
			return sum;
			
		};
		int result =demoThreeFi.addTwoNumber(45, 22);
		System.out.println("The sum of two numer is:>>>"+result);
	}

}
