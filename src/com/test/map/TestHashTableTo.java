package com.test.map;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashTableTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> htable = new Hashtable();
		htable.put(11, "Nilam");
		htable.put(12, "Pooja");
		htable.put(13, "Ramesh");
		//htable.put(14, null); Error will come NullPointerExceptin.
		//htable.put(null, "Suman"); Error will come NullPointerExceptin.
		
		//case 1:
		
		Set<Entry<Integer, String>> entrySetObj = htable.entrySet();
		Iterator<Entry<Integer, String>> iteratorObj = entrySetObj.iterator();
		while(iteratorObj.hasNext()) {
			Entry<Integer, String> entryObj = iteratorObj.next();
			Integer intObj = entryObj.getKey();
			String valueObj = entryObj.getValue();
			System.out.println(intObj +" : "+valueObj);			
		}
		

		//Case 2: for Key only
		Set<Integer> keySetObj = htable.keySet();
		Iterator<Integer> iteratorObj2 = keySetObj.iterator();
		while(iteratorObj2.hasNext()){
			Integer intObj = iteratorObj2.next();
			System.out.println(intObj);
		}
		//case 3: for value only print
		Collection<String> valuesCollect = htable.values();
		Iterator<String> iteratorObj3 = valuesCollect.iterator();
		while(iteratorObj3.hasNext()) {
			String StrObj = iteratorObj3.next();
			System.out.println(StrObj);
		}
		//Case 4: 
		Enumeration<Integer> Keyenum = htable.keys();
		while(Keyenum.hasMoreElements()) {
			Integer nextElement = Keyenum.nextElement();
		System.out.println(nextElement);
		}
		
		
		
		//Case 5:
		Enumeration<String> elements = htable.elements();
		while(elements.hasMoreElements()) {
			String  strObj= elements.nextElement();
			//System.out.println(strObj);
			int hashCode = elements.hashCode();
			System.out.println(hashCode +" : "+strObj);
			
		}
		
		
	}

}
