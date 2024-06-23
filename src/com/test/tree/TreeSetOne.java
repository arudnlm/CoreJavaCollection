package com.test.tree;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOne {
	
	public Set<ProductOne> getProductDetails()throws ParseException{
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyymmdd");
		Set<ProductOne> prodDetls=new TreeSet<>();
		prodDetls.add(new ProductOne(333,"Laptop",sdf.parse("20240525") ));
		prodDetls.add(new ProductOne(555,"Desktop",sdf.parse("20201123") ));
		prodDetls.add(new ProductOne(222,"Monitor",sdf.parse("20210918") ));
		prodDetls.add(new ProductOne(111,"Printer",sdf.parse("20180220") ));
		prodDetls.add(new ProductOne(444,"CPU computer",sdf.parse("20270728") ));
		
		return prodDetls;
	}

}
