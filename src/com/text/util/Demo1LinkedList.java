package com.text.util;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedlist= new LinkedList();
		
		linkedlist.add("java1");
		linkedlist.add("java2");
		linkedlist.add("java3");
		
		System.out.println("Size of LinkedList:>>>"+linkedlist.size());
		
		
		Iterator iterator = linkedlist.iterator();
		
		while(iterator.hasNext()) {
			
			String strObj=(String) iterator.next();
			
			System.out.println(strObj);
						
			
		}
	}

}
