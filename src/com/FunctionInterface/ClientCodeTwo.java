package com.FunctionInterface;

import java.util.Scanner;

public class ClientCodeTwo {

	public static void main(String[] args) {
	 //DemoTwoClss demoTwoClss=new DemoTwoClss();
	 
	 DemoTwoFI demoTwoClss=new DemoTwoClss();  //Here all control parent Interface have
	  
	 try (Scanner scnrObj = new Scanner(System.in)) {
		System.out.println("Enter the three Number:>>");
		 
		 int n1=scnrObj.nextInt();
		 int n2=scnrObj.nextInt();
		 int n3=scnrObj.nextInt();
		 
		 
		// String str=scnrObj.nextLine();
		 int num = demoTwoClss.largestThreeNumber(n1, n2, n3);

		 System.out.println("The largest Number is :>>" +num);
	}//catch(Exception e) {
      //System.out.println("You can put Number only" (e.printStackTrace()));
		//e.printStackTrace();
		
		 
	//}
	}

}
