package day9.demo7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class D4StreamDemo {

	public static void main(String[] args) {
		
		
		// print 1-100;
		/*for(int i=0; i<101; i++) {
			System.out.println(i);
		}*/

		// print 1-100
		// IntStream.range(1, 11).forEach(System.out::println);
		
		// print only even number
		IntStream.range(1, 10)
				.filter(input -> input % 2 == 0)
				.forEach(System.out::println);
		
		
		// even number
		System.out.println("From Collections");
		List<Integer> list = Arrays.asList(21, 232, 34, 121, 565, 67);
		list.stream()
			.filter(input -> input % 2 == 0)
			.forEach(System.out::println);
		
		
	}
}
