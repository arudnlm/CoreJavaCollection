package com.text.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class Demo6LinkedList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> listCustomer=new LinkedList<Customer>();
		listCustomer.add(new Customer(101, "Dharmendra"));
		listCustomer.add(new Customer(102,"Raju Kumar"));
		listCustomer.add(new Customer(103, "Ramesh Yadav"));
		
		System.out.println("Size of List:>>>"+listCustomer.size());
		
		Iterator<Customer> iterator=listCustomer.iterator();
		
		while(iterator.hasNext()) {
			
			Customer customer=iterator.next();
			System.out.println(customer);
			
		}
		
		
		
		
	}

}
