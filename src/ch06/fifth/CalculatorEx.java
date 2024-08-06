package ch06.fifth;

public class CalculatorEx {

	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator();
		
		System.out.println("calculator : " + Calculator.pi);
		
		int result = Calculator.addStatic(1, 2);
		System.out.println(result);
		
		add(2, 3);
	 
	}
	
	// static 함수에 사용하려면 선언하는 함수도 static 을 써야 함 
	public static int add(int a, int b) {
		return a + b;
	} 
	
	

}
