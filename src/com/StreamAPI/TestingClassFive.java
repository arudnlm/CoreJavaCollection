package com.StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class TestingClassFive {
	
	public static void main(String[] args) {
		
		List<String> ArayList= new ArrayList<>();
		
		ArayList.add("Dharmendra");
		ArayList.add("Ravi");
		ArayList.add("Ramesh");
		ArayList.add("Reena");
		ArayList.add("Dhanoj");
		ArayList.add("David Janson");
		
		List<String> streamName = ArayList.stream()
				.filter(s->s.startsWith("Dh"))
				.map(a->a.toUpperCase())
				.collect(Collectors.toList());
		
		Iterator<String> iteratorName = streamName.iterator();
		
		while (iteratorName.hasNext()) {
			String stringName =iteratorName.next();
			
			System.out.println(stringName);
			
		}
		
		//for(String str:streamName) {
		
		
		//System.out.println(str);
	//}

}
	
}
