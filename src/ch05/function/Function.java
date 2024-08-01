package ch05.function;

public class Function {

	public static void main(String[] args) {
		
		int result = sum(3, 2); // 메인 함수 안에 함수 사용
		
		say();
		
		String result2 = sayHello();
		System.out.println(result2);
		
		sum2 (3, 4);
	
	}
	
	// 함수 선언  
	public static int sum (int a, int b) {
		int sum = a + b;
		System.out.println("sum: " + sum);
		return sum; // 리턴자료형이 void인 경우에는 return 문이 필요없음 
	} 
	
	public static void say() {
		System.out.println("Hi");
	}
	
	public static String sayHello() {
		return "Hello";
	}
	
	public static void sum2 (int a, int b) {
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + sum);
	}
	
	
	
	
	
	
	
	
}
