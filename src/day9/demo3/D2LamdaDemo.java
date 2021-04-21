package day9.demo3;

public class D2LamdaDemo {
	public static void main(String[] args) {
		
		FirstInterface fi = new FirstClass();
		System.out.println(fi.hello("mumbai"));
		
		
		// With Lamda :: inline method implementation
		FirstInterface fi1 = (name) -> "hello " + name;
		System.out.println(fi1.hello("mumbai"));
		
	}
}
