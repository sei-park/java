package tr.ch06;

public class CalculatorEx {

	public static void main(String[] args) {
		
		System.out.println(Calculator.pi);
		
		int resultPrint = Calculator.addStatic(1, 2);
		System.out.println(resultPrint);
		
		System.out.println(add(2, 3));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
