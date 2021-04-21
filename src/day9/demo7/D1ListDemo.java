package day9.demo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D1ListDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("delhi");
		list.add("calcutta");
		list.add("chennai");
		list.add("mumbai");
		list.add("indore");
		
		System.out.println(list);
		
		
		// Shortcut to create a list
		List<String> list1 = Arrays.asList("delhi", "calcutta", "chennai", "mumbai", "indore");
		System.out.println(list1);
	}
}
