package com.coreArray;

public class ClientCodeMessage {

	public static void main(String[] args) {
		//case 1 
		
		String sayMessage = new MessageDemo("Deepak","Sr. Manager").sayMessage();		
		System.out.println(sayMessage);
		
		
		//case 2
		MessageDemo messageDemo = new MessageDemo("Raju", "Developer");
		String sayMessage2 = messageDemo.sayMessage();
		System.out.println(sayMessage2);
	}

}
