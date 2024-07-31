package ch04;

public class For1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("i : " + i);
		}
		
		
		// 2단부터 출력되는 구구단 
		// 2 * 1
		
//		for (int i = 2; i <= 2; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
//		
//		System.out.println("----------");
//		
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("----------");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
//		
//		System.out.println("----------");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j)); 
			}
			if (i != 9) { // 9단 밑에는 줄이 안 생기게 함 
				System.out.println("----------");
			} else {
				// by pass 구문 끝 알려주기
			}
			
		}
		
	}

}
 