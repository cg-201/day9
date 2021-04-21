package day9.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D2MainDemo {

	public static void main(String[] args) {

		// UDD
		List<Person> list = new ArrayList<>();

		list.add(new Person(1, "zzz", "rohit@gmail.com", "2323232"));
		list.add(new Person(1, "sachin", "sachin@gmail.com", "112121"));
		list.add(new Person(22, "amit", "amit@gmail.com", "3232223"));
		
		
		System.out.println(list);
		
		// A1
		// Comparator<Person> ci = (o1, o2) -> o1.getName().compareTo(o2.getName());
		// Collections.sort(list, ci);
		
		// A2 :: Recommended :: Absoulute fundamental
		 Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		// A3 :: Absoulutely Recommended  :: shorter version of lamda
		// Collections.sort(list, Comparator.comparing(Person::getId));
		
		// sortd by id but in reverese order
		Collections.sort(list, Comparator.comparing(Person::getId).reversed());
		
		// Sort by id then by name
		// Collections.sort(list, Comparator.comparing(Person::getId).thenComparing(Person::getName));
		
		System.out.println(list);

	}

}
