package com.test.map.propdemo;

public class ClientCodeProptiz {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		PropertizDemo propClinObj=PropertizDemo.getInstance();
		
		String strMsg = propClinObj.getMessageData("BBB");
		System.out.println(strMsg);
	}

}
