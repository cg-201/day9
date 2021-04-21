package day9.demo3;

public class D1HelloLamda {
	public static void main(String[] args) {

		// Without Lamda :: Implemention of FirstInterface
		FirstInterface fi = new FirstClass();
		
		// with lamda :: prefer this. :: inline implementation of FirstInterface
		FirstInterface fi4 = name -> "hello " + name;

		
		
		// With Lamda
		FirstInterface fi1 = (String name) -> {
			return "hello " + name;
		};

		// with lamda
		FirstInterface fi2 = (name) -> {
			return "hello " + name;
		};

		// with lamda
		FirstInterface fi3 = name -> {
			return "hello " + name;
		};

		
	}
}
