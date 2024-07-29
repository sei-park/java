package ch03;

public class StringConcat7 {

	public static void main(String[] args) {
		
		// 문자열 연산자(+)
		
		String stringVal1 = "jdk";
		String stringVal2 = "1.17";
		String stringVal5 = "10";
		
		String stringVal3 = stringVal1 + stringVal2;
		System.out.println("stringVal3 :" + stringVal3);
		
		int a = 1;
		String stringVal4 = stringVal1 + a;
		System.out.println("stringVal4 :"+ stringVal4);
		
		String stringVal6 = stringVal5 + a;
		System.out.println(stringVal6);
		
		// int stringVal6 = Integer.parseInt(stringVal5) + a;
	
		
	}

}
