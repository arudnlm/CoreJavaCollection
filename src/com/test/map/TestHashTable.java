package com.test.map;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> htable = new Hashtable();
		
		htable.put("e001", "Ramesh");
		htable.put("e002", "Denish");
		htable.put("e003", "Suresh");
		htable.put("e004", "Akash");
		htable.put("e005", "Raman");
		
		System.out.println("Size of map:>>>" +htable.size());
		
		// Case 1
		Set<Entry<String, String>> entryObjSet = htable.entrySet();
		Iterator<Entry<String, String>> iterator = entryObjSet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entryOb = iterator.next();
		   String keyObj = entryOb.getKey();
		   String valueObj = entryOb.getValue();
		   
		  System.out.println(keyObj +" : " +valueObj);
		  
		}

	/*	  // Case 2 (for print key)
		Set<String> keySet = htable.keySet();
		Iterator<String> iteratorKeySet = keySet.iterator();
		while(iteratorKeySet.hasNext()) {
			String keyObj = iteratorKeySet.next();
			System.out.println(keyObj);			
		}
	
		*/
		
	/*	   // Case 2 (for print value)
		Collection<String> valueCollection = htable.values();
			Iterator<String> iterator = valueCollection.iterator();
			while(iterator.hasNext()) {
				String strObj = iterator.next();
				System.out.println(strObj);
				
			}
			*/
			
			/*
		Enumeration<String> KeyEnumeration = htable.keys();
		
		Enumeration<String> str, str1;
		
		while(KeyEnumeration.hasMoreElements()) {
			String strintElem = KeyEnumeration.nextElement();
			System.out.println(strintElem);
						
		}
		Enumeration<String> elementString = htable.elements();
		while(elementString.hasMoreElements()) {
			String StringElement = elementString.nextElement();
			//System.out.println(strintElem +" : " +StringElement);
			System.out.println(StringElement);
			
		}
		*/
		
	}

}
