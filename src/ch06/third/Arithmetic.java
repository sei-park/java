package ch06.third;

public class Arithmetic {
	
	// 사칙연산 함수 생성(=,-,*,/,&)
	
	int a;
	int b;
	
	// 오버로드(오버로딩) : 같은 이름의 메소드를 여러 개 정의하는 것
	// 메소드의 이름은 같지만 파라미터의 타입이나 개수가 다름 
	// 이를 통해 같은 기능을 하는 메소드를 다양한 방식으로 호출할 수 있음 
	
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
