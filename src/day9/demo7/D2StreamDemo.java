package day9.demo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class D2StreamDemo {

	public static void main(String[] args) {
		
		demoJava8V1();
		
	}
	
	static void demoJava8V1() {
		List<String> list = Arrays.asList("Delhi", "chennai", "calcutta", "mumbai", "Delhi", "chennai", "calcutta", "mumbai");
		
		// filter all the cities which starts with C -> uppercase -> print/report
		 list.stream()
			.filter(input -> input.startsWith("c"))		// inline implementation for the Predicate
			.map(input -> input.toUpperCase())
			.forEach(System.out::println);
		
		 
		 long count = list.stream()
		 	.filter(input -> input.startsWith("c"))
		 	.count();
		 System.out.println(count);
		 
		 
		 List<String> newlist = list.stream()
		 	.filter(input -> input.startsWith("c"))
		 	.collect(Collectors.toList());
		 System.out.println(newlist);
		 
	}
	
	
	static void demoJava8() {
		List<String> list = Arrays.asList("Delhi", "chennai", "calcutta", "mumbai");
		
		// java 8 stream()
		list.stream()
			.map(data -> data.toUpperCase())  	// transforming to uppercase
			.sorted()							// sorting
			.forEach(System.out::println);		// printing
	}
	
	
	static void demoJava7() {
		List<String> list = Arrays.asList("Delhi", "chennai", "calcutta", "mumbai");
		
		// Making all the string uppercase letter
		List<String> upperCaseList = new ArrayList<>();
		for(String city : list) {
			System.out.println(city);
			
			upperCaseList.add(city.toUpperCase());
		}

		System.out.println(upperCaseList);
		
		// Then Sort all the cities
		Collections.sort(upperCaseList);
		
		System.out.println(upperCaseList);
		
	}
}
