package com.test.arrayList;
import java.util.*;


public class VEILIClassessObj {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration enm=v.elements();
		Iterator itor = v.iterator();
		ListIterator lst=v.listIterator();
		
		System.out.println("Enumeration obj:  " +enm.getClass().getName());
		System.out.println("Iterator obj: " +itor.getClass().getName());
		System.out.println("ListIterator obj: " +lst.getClass().getName());
	}
}
