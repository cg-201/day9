package day9.demo1;

import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(list);
		System.out.println(list);
		
		// sorting by name
		System.out.println("Sorted by name");
		Collections.sort(list, new PersonNameComparator());
		System.out.println(list);
		
	}
	
	
	static void demo2() {
		List<String> list = new ArrayList<String>();
		list.add("delhi");
		list.add("kolkata");
		list.add("chennai");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	
	static void demo1() {
		
		List<String> list = new ArrayList<>();
		list.add("delhi");
		list.add("kolkata");
		list.add("chennai");
		
		Set<String> set = new HashSet<>();
		set.add("delhi");
		set.add("kolkata");
		set.add("chennai");
		
		Map<String, String> map = new HashMap<>();
		map.put("de", "delhi");
		map.put("ko", "kolkata");
		map.put("ch", "chennai");
		
	}
}







