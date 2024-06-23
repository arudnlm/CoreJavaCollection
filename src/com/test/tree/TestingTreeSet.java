package com.test.tree;

import java.util.Set;
import java.util.TreeSet;

public class TestingTreeSet {
	
	public Set<Product> getProductDetails(){
		Set<Product> setProduct=new TreeSet<>();
		
		setProduct.add(new Product(333,"Laptop"));
		setProduct.add(new Product(444,"Printer"));
		setProduct.add(new Product(555,"Switches"));
		setProduct.add(new Product(111,"Washing Machine"));
		setProduct.add(new Product(222,"Computer"));
		return setProduct;
		
	}
	
	public Set<Customer> getCustomerDetails()
	{
		Set<Customer> custDetails=new TreeSet<>();
		custDetails.add(new Customer(100,"Ramesh"));
		custDetails.add(new Customer(105, "Basu Yadav"));
		custDetails.add(new Customer(103, "Atharv"));
		custDetails.add(new Customer(101, "Jitendra yadav"));
		custDetails.add(new Customer(102, "Sonu singh"));
		return custDetails;
	
	}
	

}
