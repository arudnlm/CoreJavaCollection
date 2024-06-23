package com.text.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Vector <Customer>vector = new Vector<Customer>();
		vector.addElement(new Customer(101, "Raju"));
		vector.addElement(new Customer(102, "Ramba"));
		vector.addElement(new Customer(103, "Mohan"));
		vector.addElement(new Customer(104, "Human"));
		vector.add(new Customer(105,"Dharmendra"));
		vector.add(new Customer(106,"AArush"));
		
	

		
		
		System.out.println("Size of Vector:>>>"+vector.size());
		System.out.println("Capacity of Vector:>>>"+vector.capacity());
		/*
		Enumeration<Customer> enumeration=vector.elements();
		
		while(enumeration.hasMoreElements()) {
			Customer customer=enumeration.nextElement();
			
			System.out.println(customer);
			*/
		
		Iterator<Customer> iterator= vector.iterator();
		 
		while(iterator.hasNext()) {
			
			Customer customer=iterator.next();
			System.out.println(customer);
		
		}
	}

	

}
