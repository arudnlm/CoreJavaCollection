package com.FunctionInterface;

public class DemoTwoClss implements DemoTwoFI{

	@Override
	public int largestThreeNumber(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			return num1;
		}else if(num2>num3) {
			return num2;
			
		}else {
			return num3;
		}
		
	}
	
	 

}
