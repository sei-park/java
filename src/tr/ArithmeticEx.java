package tr;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.sum(1, 2);
		System.out.println("a - b = " + arithmetic.minus(5, 3));
		System.out.println("a * b = " + arithmetic.multiply(2, 3));
		System.out.println("a / b = " + arithmetic.division(10, 2));
		System.out.println("a % b = " + arithmetic.remain(6, 3));
		
	}

}

