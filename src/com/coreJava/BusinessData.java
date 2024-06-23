package com.coreJava;

public class BusinessData {
	private String msg1= " ";
	private String msg2= " ";
	
	public BusinessData() {
		System.out.println("Hello Message");
		
	}
	public BusinessData(String msg1) {
		this.msg1=msg1;
		System.out.println("Hello Message "+msg1);
		
	}
	public BusinessData(String msg1, String msg2) {
		this.msg1=msg1;
		this.msg2=msg2;
		System.out.println("Hello Message "+msg1 +" : " +msg2);
			
	}
	
	void showMessage() {
		//System.out.println("Hello Message");
		//System.out.println("Hello Message "+msg1);
		//System.out.println("Hello Message "+msg1 +" : " +msg2);
		
	}

}
