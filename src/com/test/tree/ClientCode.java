package com.test.tree;

import java.util.Set;

public class ClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingTreeSet testingTreeSet= new TestingTreeSet();
		
		TestingTreeSet testingTreeSet1= new TestingTreeSet();
		
		Set<Product> productSet=testingTreeSet.getProductDetails();
		//Set<Customer> custSet=testingTreeSet.getCustomerDetails();
		
		Set<Customer>custSet=testingTreeSet1.getCustomerDetails();
		System.out.println("Product Details:>>>>>>");
		
		for(Product pro:productSet) {
			System.out.println(pro);
		}
		
		System.out.println("Customer Details:>>>>>>");
		for(Customer cust:custSet) {
			System.out.println(cust);
		}
		

	}

}
