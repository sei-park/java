package ch05.function;

public class Function4 {

	public static void main(String[] args) {
		
		int result = numbers( 5); // 1+2+3+4+5
		System.out.println(result);

	}
	
	// 정수 
	// 100 이내의 자연수에서 선택된 수만큼 합산
	public static int numbers(int a) {
		int sum = 0; 
		
		if(a <= 100) {
			for(int i = 1; i <= a; i++) {
				sum += i;
			}
		}
		
		return sum;
			
	}

}
