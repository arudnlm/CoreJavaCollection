package com.corejavaSir;

public abstract class ProcessAbstractClass {
	
	//  This is the abstract method
	
	public abstract void procesMessage(String strMsg);
	
	// This is the non abstract method
	
	public void showMessage(String strMsg) {
		System.out.println("ProcessAbstractClass : showMessage : "+strMsg);
	}
	
	

}
