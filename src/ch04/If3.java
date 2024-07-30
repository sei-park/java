package ch04;

public class If3 {

	public static void main(String[] args) {
		
		// int 타입의 변수를 1개 선언하고 
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램 작성 
		
		int a = 2;
		
		if (a % 2 == 0) {
			System.out.println(a + "는 " + "짝수입니다.");
		} else {
			System.out.println(a + "는 " + "홀수입니다.");
		}
		
	}

}
