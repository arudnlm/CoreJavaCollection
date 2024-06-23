package com.text.util;

public class Customer {
	
	private int customerId;
	private String customerName;
	public Customer(int customerId, String customerName) {
	
		this.customerId = customerId;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	

}
