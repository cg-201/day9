package day9.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D1MainDemo {

	public static void main(String[] args) {
		System.out.println("Hello Lamda!!");

		demo3();
	}

	static void demo3() {
		List<Person> list = new ArrayList<>();

		list.add(new Person(11, "rohit", "rohit@gmail.com", "2323232"));
		list.add(new Person(5, "sachin", "sachin@gmail.com", "112121"));
		list.add(new Person(22, "amit", "amit@gmail.com", "3232223"));

		System.out.println(list);

		// sorting by id
		System.out.println("sorted by id");
		Collections.sort(list, Comparator.comparing(Person::getId));
		System.out.println(list);

		// sorting by name
		System.out.println("Sorted by name");
		Collections.sort(list, Comparator.comparing(Person::getName));
		System.out.println(list);

		// sorting by email
		System.out.println("Sorted by mobile");
		Collections.sort(list, Comparator.comparing(Person::getMobile));
		System.out.println(list);

	}

}
