package day9.demo7;

import java.util.Arrays;
import java.util.List;

public class D5StreamDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("delhi", "calcutta", "chennai", "mumbai", "indore");
		
		
		list.stream()
			.map( (str) -> str.toUpperCase())					// longer
			.forEach((str) -> System.out.println(str));			// longer
		
		
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);						// :: method refernce
	}
	
}
