package ch03;

public class LogicalOperator5 {

	public static void main(String[] args) {
		

		// 논리 연산자(&&, &&, |, ||, ^)
		// ^ : 배타적 논리합 : true/true = flase , false/false = flse , true/false = true , false/true = true
		
		int a = 65; 
		
		if (a >= 65 && a <= 70) {
			System.out.println("&& : TRUE");
		}
		
		if (a >= 65 & a <= 70) {
			System.out.println("&& : TRUE");
		}
		
		if (a > 65 || a <= 70) {
			System.out.println("|| : TRUE");
		}
		
		if (a > 65 | a <= 70) {
			System.out.println("| : TRUE");
		} 
		
		if (a > 65 ^ a <= 70) {
			System.out.println("^ : TRUE");
		} 

	}

}
