package com.text.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo5LinkedList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>();
		list.add("Java one");
		list.add("Java Two");
		list.add("Java Three");
		list.add("Java Four");
		list.add("Java Five");
		list.add("Java Six");
		
		System.out.println("Size of List object:>>>"+list.size());
		
		Iterator<String> iterator =list.iterator();
		
	
		while(iterator.hasNext()) {
			
			String StrObj= iterator.next();
			System.out.println(StrObj);
			
			
			
		}
		
		
	}

}
