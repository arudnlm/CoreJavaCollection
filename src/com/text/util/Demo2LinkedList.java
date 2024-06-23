package com.text.util;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo2LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList =new LinkedList();
		linkedList.add(new Float(10.4f));
		linkedList.add(new Float(120.4f));
		linkedList.add(new Float(103.4f));
		linkedList.add(new Float(104.4f));
		
		System.out.println("Size of LinkedList:>>>"+linkedList.size());
		
		
		Iterator iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			
			Float flObj=(Float) iterator.next();
			System.out.println(flObj);
			
		}
		
	}

}
