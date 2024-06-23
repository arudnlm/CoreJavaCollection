package com.test.tree;

import java.text.ParseException;
import java.util.Set;

public class ClientCodeOne {

	public static void main(String[] args) {
		
		try {
		TreeSetOne treeSetOne= new TreeSetOne();
		Set<ProductOne> prodSet=treeSetOne.getProductDetails();
		for(ProductOne pro:prodSet) {
			System.out.println(pro);
		}

	}catch(ParseException e) {
		e.printStackTrace();
	}

}
}