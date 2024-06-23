package com.coreJava;

import java.util.Scanner;

public class ClientCodeTesting {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the Radious:  ");
	   int radious=scanner.nextInt();
	   
	   ICalculateCircleAreaImpl calculateArea=new ICalculateCircleAreaImpl();
	   
	   calculateArea.calculateArea(radious);
	}

}
