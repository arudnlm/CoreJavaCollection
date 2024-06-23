package com.StreamAPI;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestingClientTwo {

	public static void main(String[] args) {
		
		Set<String> setName=new HashSet<>();
		setName.add("Deepak");
		setName.add("Deepak");
		setName.add("Suresh");		
		setName.add("Ramesh");
		setName.add("Dinesh");
		setName.add("Ajeet");
		setName.add("Danoj");
		
		List<String> streamName = setName.stream()
				.filter(s->s.startsWith("D"))
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		
		Iterator<String> iteratorName = streamName.iterator();
		
		
		while (iteratorName.hasNext()) {
			String stringName = (String) iteratorName.next();
			System.out.println(stringName);
			
		}
		
	}

}
