package day9.demo6;

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
		// UDD
		List<Person> list = new ArrayList<>();

		list.add(new Person(11, "rohit", "rohit@gmail.com", "2323232"));
		list.add(new Person(5, "sachin", "sachin@gmail.com", "112121"));
		list.add(new Person(22, "amit", "amit@gmail.com", "3232223"));

		System.out.println(list);

		// sorting by id
		System.out.println("sorted by id");
		
		
		// Approach 0
		list.sort((o1, o2) ->  o1.getId() - o2.getId());

		// Approch 1 
		Comparator<Person> ci = (o1, o2) ->  o1.getId() - o2.getId(); 
		Collections.sort(list, ci);
		
		// Approach 2
		Collections.sort(list, (o1, o2) ->  o1.getId() - o2.getId());
		

		
		
		
		
		
		
		// Lamda has been further simplified using Method Refrerece
		Collections.sort(list, Comparator.comparing( (Person p) -> p.getId() ));
		Collections.sort(list, Comparator.comparing(Person::getId));

	}

}


