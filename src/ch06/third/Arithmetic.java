package ch06.third;

public class Arithmetic {
	
	// 사칙연산 함수 생성(=,-,*,/,&)
	
	int a;
	int b;
	
	void sum(int a, int b) {
		int sum01 = a + b;
		System.out.println("a + b = " + sum01);
	}
	
	public int minus(int a, int b) {
		int result = a - b;
		return result; 
	}
	
	public int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public int division(int a, int b) {
		int result = a / b;
		return result;
	}
	
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	

	

	
 

}
