package com.coreArray;

public class MessageDemo {
	private String name=" ";
	private String role=" ";
	
	
	public MessageDemo(String name, String role) {
		
		this.name=name;
		this.role=role;
		
		
	}
	public String sayMessage() {
		String result= name +" : " +role;
		return result;
		
	}
	
	

}
