package com.test.arrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEmp {
	
	public void getEmployeeDetails(){
		List<Employee> empList=new ArrayList();
		empList.add(new Employee(11, "Aarush Yadav"));
		empList.add(new Employee(12, "Aarush Yadav"));
		empList.add(new Employee(15, "Seema Yadav"));
		empList.add(new Employee(9, "Atharv Yadav"));
		empList.add(new Employee(10, "Tinku Yadav"));
		empList.add(new Employee(4, "Jitendra Yadav"));
		
		System.out.println("Size of Employee List:>>>>" +empList.size());
		
		for(Employee emp:empList) {
			System.out.println(emp);
			//empList.add(new Employee(4, " Yadav")); Error concurrentModificationException
		}
	}
	
	public void getProductDetails() {
		LinkedList<String> linklist =new LinkedList();
		linklist.add("Computer");
		linklist.add("Printer");
		linklist.add("Paper");
		linklist.add("Laptop");
		System.out.println("Size of Product List:>>>>" +linklist.size());
		for(String str:linklist) {
			
		System.out.println(str);
		//linklist.add("Desktop System"); Error concurrentModificationException
		
		}
	}

}
