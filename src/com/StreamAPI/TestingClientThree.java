package com.StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestingClientThree {
	
	public static void main(String[] args) {
		
		String[] arrayName= new String[5];
		
		arrayName[0]="Deepak";
		arrayName[1]="Suresh";
		arrayName[2]="Ramesh";
		arrayName[3]="Dinesh";
		arrayName[4]="Dhanoj";
		
		List<String> arrayList= Arrays.asList(arrayName);
		
		
		List<String> collectName = arrayList.stream().filter(s->s.startsWith("D")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		Iterator<String> iteratorName = collectName.iterator();
		while (iteratorName.hasNext()) {
			String stringName = (String) iteratorName.next();
		     System.out.println(stringName);
			
		}
	}

}
