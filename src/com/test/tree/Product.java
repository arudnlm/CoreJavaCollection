package com.test.tree;

public class Product implements Comparable<Product>{
	private Integer pid;
	private String pname;
	
	
	public Product(Integer pid, String pname) {
		
		this.pid = pid;
		this.pname = pname;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}


	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		if(this.pid>product.getPid()) {
			return 1;
		}else if(this.pid<product.getPid()) {
			return -1;
			
		}else {
			return 0;
		}
	
	}



	
	

}
