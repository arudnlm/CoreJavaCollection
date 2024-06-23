package com.text.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Vector <Integer>vector = new Vector<Integer>();
		vector.addElement(new Integer(101));
		vector.addElement(new Integer(102));
		vector.addElement(new Integer(103));
		vector.addElement(new Integer(104));
		vector.addElement(new Integer(105));
		vector.insertElementAt(new Integer(106), 4);

		
		
		System.out.println("Size of Vector:>>>"+vector.size());
		System.out.println("Capacity of Vector:>>>"+vector.capacity());
		
		Enumeration<Integer> enumeration=vector.elements();
		
		while(enumeration.hasMoreElements()) {
			Integer intObj=enumeration.nextElement();
			
			System.out.println(intObj);
			
		}
	}

}
