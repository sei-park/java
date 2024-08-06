package tr;

public class Arithmetic {
	
	int a;
	int b;
	 
	void sum(int a, int b) {
		int result = a + b;
		System.out.println("a + b = " + result);
	}
	
	public int minus(int a, int b) {
		int resultMinus = a - b;
		return resultMinus;
	}
	
	public int multiply(int a, int b) {
		int resultMultiply = a * b;
		return resultMultiply;
	}
	
	public int division(int a, int b) {
		int resultdivision = a / b;
		return resultdivision;
	}
	
	public int remain(int a, int b) {
		int resultRemain = a % b;
		return resultRemain;
	}

}
