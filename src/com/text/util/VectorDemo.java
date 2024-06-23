package com.text.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Vector vector = new Vector();
		vector.addElement("Java1");
		vector.addElement("Java2");
		vector.addElement("Java3");
		vector.addElement("Java4");
		vector.addElement("Java5");
		vector.addElement("Java6");
		vector.addElement("Java7");
		vector.addElement("Java8");
		vector.addElement("Java9");
		vector.addElement("Java10");
		vector.addElement("Java11");
		
		
		System.out.println("Size of Vector:>>>"+vector.size());
		System.out.println("Capacity of Vector:>>>"+vector.capacity());
		
		Enumeration enumeration=vector.elements();
		
		while(enumeration.hasMoreElements()) {
			String strObj=(String)enumeration.nextElement();
			
			System.out.println(strObj);
			
		}
	}

}
