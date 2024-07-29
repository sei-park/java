package tr;

public class LogicalOperator5Tr {

	public static void main(String[] args) {
		
		int a = 65; 
		
		if (a >= 65 && a <= 70) {
			System.out.println("&& : TRUE");
		}
		
		if (a >= 65 & a <= 70) {
			System.out.println("& : TRUE");
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

