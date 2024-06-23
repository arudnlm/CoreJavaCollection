package com.test.arrayList;

public class Employee {
	
	private Integer empid;
	private String empname;
	
	public Employee(Integer empid, String empname) {
		
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	

}
