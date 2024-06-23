package com.test.tree;

public class Customer implements Comparable<Customer>{
	
	private Integer customerId;
	private String customerName;
	
	
	public Customer(Integer customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	@Override
	public int compareTo(Customer custObj) {
		
		if(this.customerId>custObj.customerId) {
			return 1;
			
		}else if(this.customerId<custObj.customerId) {
			return -1;
		}else {
			return 0;
		}
			
		
	}

}
