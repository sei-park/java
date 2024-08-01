package ch05.function;

public class Function3 {

	public static void main(String[] args) {
		
		int result01 = numbers(10, 20, 30);
		System.out.println(result01);
		
	}
	
	//세 수를 주면 최대값을 반환하는 함수
	public static int numbers(int a, int b, int c) {
		int result = 0;
		
		if(a > b && a > c) {
			result = a;
		} else if (b > a && b > c) {
			result = b;
		} else {
			result = c;
		}
		
		return result;
	}
	

}
