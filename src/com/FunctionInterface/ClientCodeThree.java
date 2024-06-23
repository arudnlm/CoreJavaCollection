package com.FunctionInterface;

public class ClientCodeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOneFI demoData= ()-> {
			System.out.println("This is the Lemda function");
			int s,y,z;
			s=4;
			y=7;
			z=s+y;
			System.out.println(z);
		};
		
		demoData.showData();
	}

}
