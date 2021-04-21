package day9.demo7;

import java.util.Arrays;
import java.util.List;

public class D6StreamDemo {
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
					new Person(11, "rohit", "rohit@gmail.com", "1211212"),
					new Person(10, "virat", "virat@gmail.com", "32232323"),
					new Person(33, "sachin", "saching@gmail.com", "1211212")
				);
		
		
		// stream
		list.stream()
			.filter(input -> input.getId() > 10)			// filter id > 10
			.forEach(System.out::println);					// printing
		
		list.stream()
			.filter(input -> input.getId() > 10)
			.map(p -> p.getName())							// longer version
			.forEach(System.out::println);
		
		
		
		System.out.println("Method Reference Version");
		list.stream()
			.filter(input -> input.getId() > 10)
			.map(Person::getName)							// shorter version :: method re
			.forEach(System.out::println);
		
	}
}
