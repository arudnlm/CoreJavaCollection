package com.StreamAPI;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingClientFour {
	
	

	public static void main(String[] args) {
		
		String[] arrayName= new String[5];
		
		arrayName[0]="Dhanoj";
		arrayName[1]="Ramesh";
		arrayName[2]="Suresh";
		arrayName[3]="Dinesh";
		arrayName[4]="Deepak";
		
		Stream<String> streamName = Stream.of(arrayName);
		
		List<String> collectList = streamName.filter(s->s.startsWith("D"))
		.map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		/*for(String str:collectList) {
			
			System.out.println(str);
			
		}*/
		
		Iterator<String> iteratorName = collectList.iterator();
		while (iteratorName.hasNext()) {
			String str =iteratorName.next();
			System.out.println(str);
			
		}
		
	}

}
