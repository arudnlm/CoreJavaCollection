package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjct {
	
	public static void main(String[] args) {
		
		// Creating Stream Objects
		
		Stream<Object> emptyObj = Stream.empty();
		System.out.println("Empty Stream Object: " +emptyObj);
		
		String name[]= {"Durgesh", "Ramesh", "Divya", "Dinesh", "Raju"};
		System.out.println("Lenght of Array is: "+name.length);
		
		Stream<String> stream1 = Stream.of(name);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//2
		
		//Stream<Object> stream = Stream.builder().build();

		IntStream stream2 = Arrays.stream(new int[]{3,4,6,7});
		
		stream2.forEach(e->{
			System.out.println(e);
			
		});
		//3
		List<Integer> list3= new ArrayList<>();
		 list3.add(2);
		 list3.add(12);
		 list3.add(23);
		 list3.add(32);
		 list3.add(54);
		 
		 Stream<Integer> stream3 = list3.stream();
		 
		 stream3.forEach(e->{
			System.out.println(e);
		 });
	}

}
