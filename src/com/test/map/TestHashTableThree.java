package com.test.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashTableThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<String, Customer> htable = new Hashtable();
		
		htable.put("e001", new Customer(1, "Ramesh"));
		htable.put("e002", new Customer(2, "Dharmendra"));
		htable.put("e003", new Customer(3, "Sohan Singh"));
		htable.put("e004", new Customer(4, "Ramesh Kumar"));
		htable.put("e005", new Customer(5, "Suman"));
		//htable.put("e006", null);
		//htable.put(null, null);
		
		System.out.println("Size of map:>>>" +htable.size());
		
		Set<Entry<String, Customer>> entrySetObj = htable.entrySet();
		
		Iterator<Entry<String, Customer>> iteratorObj = entrySetObj.iterator();
		while(iteratorObj.hasNext()) {
			Entry<String, Customer> entryObj = iteratorObj.next();
			String StrObj = entryObj.getKey();
			Customer custvalue = entryObj.getValue();
			System.out.println(StrObj +" : " +custvalue);
		}
		
		
	}

}
