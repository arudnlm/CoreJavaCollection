package com.test.SetList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSetOne hashSet= new HashSetOne();
		//HashSet<String> hs = new HashSet();  //for will work but if we remove String in HashSet
		//it will give error.
		HashSet hs = new HashSet<>();
		HashSet<String> ln = new HashSet<>();

		hs.add("Rajesh");
		hs.add("Rajesh");
		hs.add("Suman");
		hs.add("Suman");
		hs.add("Dsy");
		ln.add("Mohan");
		ln.add("Raju");
		ln.add("Atharv");
		hs.addAll(ln);
		System.out.println("Size of List:>>>"+hs.size());
		System.out.println("Size of List:>>>"+ln.size());
		System.out.println(hs);
		System.out.println(ln);
		
		Iterator<String>  itr= hs.iterator();
		while(itr.hasNext()) {
			String str =itr.next();
			
			System.out.println(str);
			
		}
		/*for(String str:hs) {
			System.out.println(str);
		}*/

	}

}
