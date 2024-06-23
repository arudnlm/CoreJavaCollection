package com.coreJava;

public class ISimpleIntrestImpl implements ISimpleIntrest{

	@Override
	public void calculateSimpleIntrest(float amount, float rate, int time) {
	float simpleInterest = (amount * rate * time)/100;
	
	System.out.println("The simple Interest is :  "+simpleInterest);
		
	}
	
	

}
