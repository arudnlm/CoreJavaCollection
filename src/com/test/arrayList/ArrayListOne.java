package com.test.arrayList;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;

public class ArrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListOne arrListOne= new ArrayListOne();
		//List<Employee> empList= arrListOne.getEmployeeDetails();
		
		List<Employee> empList= arrListOne.readOnlyList();
		//empList.add(new Employee(22, "Umesh singh"));
		
		
		
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		
	}
	
	public List<Employee> readOnlyList(){
		List<Employee> readEmplyOnly=getEmployeeDetails();
		List<Employee> emp2=Collections.unmodifiableList(readEmplyOnly);
		return emp2;
		
		
	}
	
	
		
		// List<Employee> getEmployeeDetails(){
		public List<Employee> getEmployeeDetails(){
			 
			List<Employee> eml=new ArrayList();
			eml.add(new Employee(11, "Dharmendra"));
			eml.add(new Employee(12, "Suman"));
			eml.add(new Employee(13, "Ravi"));
			eml.add(new Employee(14, "Ramesh"));
			eml.add(new Employee(15, "Atharv Yadav"));
			
			return eml;
				
			
			
		}
	}






