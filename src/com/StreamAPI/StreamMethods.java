package com.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	
	public static void main(String[] args) {
		
		List<String> stream1 = List.of("Aman", "Pradeep","Amit","Deepak", "Aarush","Atharv");
		
		List<String> collectName = stream1.stream().filter(e->e.startsWith("A")).map(e->e.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(collectName);
		
		List<Integer> list2 = List.of(4,2,6,8,9);
		List<Integer> collect2 = list2.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println("Squire of given Number: "+collect2);
		
		//or by using forEach loop
		
		stream1.forEach(
				e->{
					System.out.println(e);
				}
				
				);
		
		//for shot cut method
		System.out.println("Shotcut method printed: ");
		
		collectName.stream().forEach(System.out::println);
		
		//sorted
		list2.stream().sorted().forEach(System.out::println);
		//for min value
		
		Integer integer = list2.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Minum number from list2: ");
		System.out.println(integer);
		
		Integer integer2 = list2.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max number is: "+integer2);
	}
	

}
