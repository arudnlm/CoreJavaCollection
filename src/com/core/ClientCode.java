package com.core;

public class ClientCode {
	public static void main(String[] arg) {
		FuntionInter addNum=(int a, int b)->{
			
			int c = a+b;
			
			return c;
			
			
		};
		 int number =addNum.AddTwoNumber(23, 55);
		 
		 System.out.println(number);
		
	}

}
