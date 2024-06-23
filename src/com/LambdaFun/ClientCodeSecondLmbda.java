package com.LambdaFun;

public class ClientCodeSecondLmbda {
	
	public static void main(String[] args) {
		
	MyFourthFI fourthFI	=(int num1, int num2)->{
		
		int sum= num1 + num2;
		
		return sum;
			 
		 };
		 
		 int twoNumber = fourthFI.addTwoNumber(45, 55);
		 System.out.println("Addition of two Number is:>>> "+twoNumber);
	}

}
