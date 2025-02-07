package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String args[]) {
		List<String> list = Arrays.asList("Varnan","Aman","Karan");
		List<String> stream = list.stream().           // list->stream
				filter(name->name.startsWith("V")).
				collect(Collectors.toList());
		System.out.println(stream);
		
		List<String> stream1 = list.stream().
				map(String::toUpperCase).
				collect(Collectors.toList());
		System.out.println(stream1);
		
		
		  List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
			List<Integer> sortedNumbers = numbers.stream()
			   .sorted()
			   .collect(Collectors.toList());
			System.out.println(sortedNumbers);
			
			List<Integer> numbers1 = Arrays.asList(10, 20, 5, 25, 30);
			int min = numbers1.stream().min(Integer::compare).get();
			int max = numbers1.stream().max(Integer::compare).get();
			System.out.println(min);
			System.out.println(max);
	}
}
