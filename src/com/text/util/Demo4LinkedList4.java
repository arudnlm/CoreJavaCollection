package com.text.util;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Demo4LinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new LinkedList();
		list.add(new Integer(100));
		list.add(new Integer(120));
		list.add(new Integer(103));
		list.add(new Integer(104));
		
		System.out.println("Size of LinkedList:>>>"+list.size());
		
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			Integer intObj=(Integer) iterator.next();
			System.out.println(intObj);
			
		}
		
	}

}
