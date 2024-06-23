package com.coreJava;

public class IProcessImp implements IProcess{

	@Override
	public void processData() {
		System.out.println("This is the process data method....");
		
	}

	@Override
	public void messageData() {
		System.out.println("This is the message data method.....");
		
		
	}
	public void simpleData() {
		System.out.println("This is the simple data method....");
	}
	

}
