package com.StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestingClientOne {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Deepak");
		nameList.add("Suresh");
		nameList.add("Ramesh");
		nameList.add("Dinesh");
		nameList.add("Ajeet");
		nameList.add("Danoj");

		List<String> streamList = nameList.stream().filter(s -> s.startsWith("D")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());

		Iterator<String> iteratorList = streamList.iterator();

		while (iteratorList.hasNext()) {
			String stringName = iteratorList.next();

			System.out.println(stringName);
		}
	}

}
