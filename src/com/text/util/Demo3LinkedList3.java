package com.text.util;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo3LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList =new LinkedList();
		linkedList.add(new Integer(100));
		linkedList.add(new Integer(120));
		linkedList.add(new Integer(103));
		linkedList.add(new Integer(104));
		
		System.out.println("Size of LinkedList:>>>"+linkedList.size());
		
		
		Iterator iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			
			Integer intObj=(Integer) iterator.next();
			System.out.println(intObj);
			
		}
		
	}

}
