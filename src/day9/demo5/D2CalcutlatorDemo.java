package day9.demo5;

import java.util.function.BiFunction;

public class D2CalcutlatorDemo {
	
	public static void main(String[] args) {
		
		// BiFunction for SUM
		BiFunction<Integer, Integer, Integer> biSum = (n1, n2) -> n1 + n2;
		System.out.println(biSum.apply(10, 10));
		
		// DIFF
		BiFunction<Integer, Integer, Integer> bidiff = (n1, n2) -> n1 - n2;
		System.out.println(bidiff.apply(100, 50));
		
		// MUL
		BiFunction<Integer, Integer, Integer> biMul = (n1, n2) -> n1 * n2;
		System.out.println(biMul.apply(10, 10));
		
		
		BiFunction<String, Integer, String> bisample = (n1, n2) -> n1 + n2 + " world";
		System.out.println(bisample.apply("sachin", 100));
	}

}

