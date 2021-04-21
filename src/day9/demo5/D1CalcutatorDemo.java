package day9.demo5;

import java.util.function.Function;

public class D1CalcutatorDemo {
	public static void main(String[] args) {
		
		// RHS :: lamda 
		SquareInterface sq = n1 -> n1 * n1;
		System.out.println(sq.square(10));
		
		Function<Integer, Integer> fi = n1 -> n1 * n1;
		System.out.println(fi.apply(10));
		
	}
}

interface SquareInterface{
	int square(int n1);
}

