package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		 List<Integer> list1 = List.of(2,4,23,22,55,34,12,16,19,54,38,77,66);
		 
		// list1.add(100);
		 System.out.println(list1);
		 
		 List<Integer> list2 = Arrays.asList(44, 53, 56, 66,82,81, 29, 10);
		 List<Integer> collectList2 = list2.stream().filter(i->i>40).collect(Collectors.toList());
		 System.out.println(collectList2);
		 
		 List<Integer> list3= new ArrayList<>();
		 list3.add(2);
		 list3.add(12);
		 list3.add(23);
		 list3.add(32);
		 list3.add(54);
		
		 //Byoler code
		 List<Integer> listEven= new ArrayList<>();
		 
		 for(int i: list1)
		 {
			 if(i% 2 == 0)
			 {
				 listEven.add(i);
				 
			 }
			 
			 
		 }
	
		 System.out.println("Even numbers are: " +listEven);
		 
		 //using Stream API
		 
		 Stream<Integer> stream = list1.stream();
		 
		 List<Integer> collectEven = stream.filter(i -> i % 2 == 0 ).collect(Collectors.toList());
		 System.out.println("Even numbers through stream: " +collectEven);
		
	}

}
