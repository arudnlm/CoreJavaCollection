package com.test.SetList;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> htable= new Hashtable<>();
		htable.put("eoo1", new Integer(1000));
		htable.put("eoo2", new Integer(2000));
		htable.put("eoo3", new Integer(3000));
		htable.put("eoo4", new Integer(4000));
		htable.put("eoo5", new Integer(5000));
		
		System.out.println("Size of Map:>>>"+ htable.size());
		
		Set<Entry<String, Integer>> entrySetObj = htable.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySetObj.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entryObj = iterator.next();
			String strObj = entryObj.getKey();
			Integer IntObj = entryObj.getValue();
			System.out.println(strObj + " : " +IntObj);
			
		}
	}

}
