package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingClient {
	
	public static void main(String[] args) {
		List<String> nameList= new ArrayList<>();
		nameList.add("Deepak");
		nameList.add("Suresh");
		nameList.add("Ramesh");
		nameList.add("Dinesh");
		nameList.add("Dhonaj");
		
		Stream<String> nameStream = nameList.stream();
		Stream<String> filterStream = nameStream.filter(s->s.startsWith("D"));
		Stream<String> mapStream = filterStream.map(s->s.toUpperCase());
		
		List<String> collectList = mapStream.collect(Collectors.toList());
		
		for(String name:collectList) {
			System.out.println(name);
		}
	}

}
