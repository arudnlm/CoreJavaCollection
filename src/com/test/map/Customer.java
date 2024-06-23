package com.test.map;

public class Customer {
	
	private Integer custId;
	private String custName;
	public Customer(Integer custId, String custName) {
		
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	

}
