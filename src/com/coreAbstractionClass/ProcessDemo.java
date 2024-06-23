package com.coreAbstractionClass;

public abstract class ProcessDemo {

	
	//This is abstract method..
	public abstract void processMessage(String strMsg);
	//This is non abstract method.
	
	public void showMessage(String strMsg) {
		System.out.println("ProcessDemo: showMessage : "+ strMsg);
	}
}
