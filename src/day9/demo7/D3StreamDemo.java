package day9.demo7;

import java.util.Arrays;
import java.util.List;

public class D3StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(21, 232, 34, 121, 565, 67);
		
		// max
		int max = list.stream()
					.max((p1, p2) -> p1.compareTo(p2))
					.get(); // terminal
		System.out.println(max);
		
		
		int min = list.stream()
						.min((p1, p2) -> p1.compareTo(p2))
						.get(); // terminal
		System.out.println(min);
		
	}
}
