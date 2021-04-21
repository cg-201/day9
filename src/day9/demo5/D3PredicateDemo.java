package day9.demo5;

import java.util.function.Predicate;

public class D3PredicateDemo {
	public static void main(String[] args) {
		
		
		Predicate<String> pi = (n1) -> n1.startsWith("a");
		
		System.out.println(pi.test("amit"));
		
	}
}
