package day9.demo4;

public class D1CalculatorDemo {

	public static void main(String[] args) {
		// Hello interface
		HelloInterface hi = (name) -> "Hello " + name;
		System.out.println(hi.sayHello("mumbai"));
		
		// Square interface
		SquareInterface si = n1 -> n1*n1;
		System.out.println(si.square(10));
		
		// Sum Interface
		SumInterface sumi = (n1, n2) -> n1 + n2;
		System.out.println(sumi.sum(10, 10));
		
		
		// Divide interface
		DivideInterface di = (n1, n2) -> {
			if(n2 == 0) {
				return 0;
				// throw an exception
			}
			
			return n1/n2;
		};
		System.out.println(di.divide(10.0, 2.0));
	}
}


@FunctionalInterface
interface HelloInterface{
	String sayHello(String name);
}

@FunctionalInterface
interface SquareInterface{
	int square(int n1);
}

@FunctionalInterface
interface SumInterface{
	int sum(int n1, int n2);
}

@FunctionalInterface
interface DiffInterface{
	int difference(int n1, int n2);
}

@FunctionalInterface
interface MultiplyInterface{
	double multiply(double n1, int n2);
}

@FunctionalInterface
interface DivideInterface{
	double divide(double n1, double n2);
}

@FunctionalInterface
interface CubeInterface {
	double cube(int n);
}
