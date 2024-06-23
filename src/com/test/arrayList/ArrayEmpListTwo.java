package com.test.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayEmpListTwo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayEmpListTwo arrayEmpList= new ArrayEmpListTwo();
		
		//ArrayList<Employee> al=  new ArrayList();
		//LinkedList<Employee> al=  new LinkedList();
		List<Employee> al= new LinkedList();
		//List<Employee> al=  new Vector();
		//Vector<Employee> al=  new Vector();
		//List<Employee> al=  new ArrayList();
		al.add(new Employee(1,"Ravi"));
		al.add(new Employee(2,"Sohan"));
		al.add(new Employee(2,"Sohan"));
		al.add(new Employee(3,"Mohan"));
		al.add(new Employee(1,"Ravi"));
		al.add(new Employee(4,"Ram"));
		
		System.out.println("Size of Employee:>>>"+al.size());
		//System.out.println(al);
		for(Employee em:al) {
			
			System.out.println(em);
		}
		
		

	}

}
