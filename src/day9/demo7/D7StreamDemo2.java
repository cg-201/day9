package day9.demo7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D7StreamDemo2 {
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
					new Person(10, "vbhit", "rohit@gmail.com", "1211212"),
					new Person(10, "varat", "virat@gmail.com", "32232323"),
					new Person(33, "sachin", "saching@gmail.com", "1211212")
				);
		
		
		// stream
		list.stream()
			.filter(input -> input.getId() > 0)
			.sorted(Comparator.comparing(Person::getId))
			.forEach(System.out::println);
		
		
		System.out.println("ID AN NAME SORTING");
		list.stream()
			.filter(input -> input.getId() > 0)
			.sorted(Comparator.comparing(Person::getId).thenComparing(Person::getName))
			.forEach(System.out::println);
		
		
		
	}
}
