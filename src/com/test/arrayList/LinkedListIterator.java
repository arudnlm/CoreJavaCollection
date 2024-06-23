package com.test.arrayList;

import java.util.*;

public class LinkedListIterator {
	public static void main(String[] args) {
		LinkedList<String> lkList = new LinkedList<>();
		lkList.add("Balakrishna");
		lkList.add("Naga");
		lkList.add("Venki");
		lkList.add("Cheru");
		lkList.add("Chitra");
		lkList.add("Ramakrishna");
	
			System.out.println("This is Old List: "+lkList);
		
		
		ListIterator<String> listIterator = lkList.listIterator();
		while(listIterator.hasNext())
		{
			String str = listIterator.next();
			if(str.equals("Venki")) {
				listIterator.remove();
				
			}
			else if(str.equals("Naga")) {
				listIterator.add("Atharv Yadav");
				
			}
			else if(str.equals("Cheru")) {
				listIterator.set("Aarush");
			}
			
			
		}
		System.out.println("This is new List: "+lkList);
	}

}
