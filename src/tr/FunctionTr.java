package tr;

public class FunctionTr {

	public static void main(String[] args) {
		
		int sum = sum(1, 2);
		
		say();
		
		String result01 = sayHello();
		System.out.println(result01);
		
		sum02(2, 3);
		
		String result02 = numbers(2);
		System.out.println(result02);
		
		int result03 = numBer(10, 20, 30);
		System.out.println(result03);
		
	}
	
	public static int sum (int a, int b) {
		int plus = a + b;
		System.out.println("plus: " + plus);
		return plus;
	}
	
	public static void say() {
		System.out.println("Hi");
	}
	
	public static String sayHello() {
		return "Hello";
	}
	
	public static void sum02 (int a, int b) {
		int plus02 = a + b;
		System.out.println(a + " + " + b + " = " + plus02);
	}
	
	public static String numbers(int a) {
		
		if(a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	public static int numBer(int a, int b, int c) {
		
		int numberResult = 0;
		
		if(a > b && a > c) {
			numberResult = a;
		} else if (b > a && b > c) {
			numberResult = b; 
		} else {
			numberResult = c;
		}
		
		return numberResult;
	}
	


}
