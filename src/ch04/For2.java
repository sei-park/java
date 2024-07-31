package ch04;

public class For2 {

	public static void main(String[] args) {
		
		// 1부터 10까지 더하기
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		
		// 11~50까지 짝수의 합
		int evenNumberSum = 0;  
		
		for (int i = 11; i <= 50; i++) {
			if (i % 2 == 0) {
				evenNumberSum += i;
			} else {
				// by pass
			}
		}
		System.out.println("evenNumberSum = " + evenNumberSum);
		


	}

}
