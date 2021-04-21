package day9.demo6;

import java.util.ArrayList;
import java.util.List;

public class D3MainDemo {

	public static void main(String[] args) {

		// UDD
		List<Person> list = new ArrayList<>();

		list.add(new Person(1, "zzz", "rohit@gmail.com", "2323232"));
		list.add(new Person(1, "sachin", "sachin@gmail.com", "112121"));
		list.add(new Person(22, "amit", "amit@gmail.com", "3232223"));
		
		
		// A1
		System.out.println("A1");
		for(int i = 0; i <list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
		}
		
		// A2 :: Enhanced For Loop.
		System.out.println("A2");
		for(Person p : list) {
			System.out.println(p);
		}
		
		// A3 :: forEach
		System.out.println("A3");
		// inline implementation of cosnumer interface 
		list.forEach(p -> System.out.println(p));
		
		
		// A4 :: forEach :: method referencing
		System.out.println("A4");
		list.forEach(System.out::println);
		
	}
}
