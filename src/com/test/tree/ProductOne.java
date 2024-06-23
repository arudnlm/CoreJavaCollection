package com.test.tree;

import java.util.Date;

public class ProductOne implements Comparable<ProductOne> {

	private Integer prodctId;
	private String prodctName;
	private Date dateformate;

	public ProductOne(Integer prodctId, String prodctName, Date dateformate) {
		this.prodctId = prodctId;
		this.prodctName = prodctName;
		this.dateformate = dateformate;
		}

	@Override
	public String toString() {
		return "ProductOne [prodctId=" + prodctId + ", prodctName=" + prodctName + ", dateformate=" + dateformate + "]";
	}

	public Integer getProdctId() {
		return prodctId;
	}

	public void setProdctId(Integer prodctId) {
		this.prodctId = prodctId;
	}

	public String getProdctName() {
		return prodctName;
	}

	public void setProdctName(String prodctName) {
		this.prodctName = prodctName;
	}

	public Date getDateformate() {
		return dateformate;
	}

	public void setDateformate(Date dateformate) {
		this.dateformate = dateformate;
	}

	@Override
	public int compareTo(ProductOne prodOne) {
		
		if(this.dateformate.compareTo(prodOne.getDateformate()) > 0)
		{
			return 1;
		}else if(this.dateformate.compareTo(prodOne.getDateformate()) < 0) 
		{
			return -1;
		}else 
		{
			return 0;
		}
		// TODO Auto-generated method stub
	
	}

}
