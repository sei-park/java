package ch02;

public class VariableEx {
	
		// 상수 표기법 
		static final int SOCIAL_SECURITY_NUMBER = 11111;
		
		// 스네이크 표기법
		int social_security_number;
		
		// 파스칼 표기법 : 클래스
		int SocialSecurityNumber;
		
		// 카멜 표기법 : 변수, 함수 
		int socialSecurityNumber;
 
	public static void main(String[] args) {
		
		// 대소문자 구분 
		int number = 1;
		int Number = 2;
		
		System.out.println(number + " : " + Number);
		
		/////
		int a; 
		int b = 1;
		int c = 0;
	    	
		// c = a + b; a에 할당이 안 되어 있기 때문에 오류남. 초기값 설정 필수
		
		/////
//		int d = 1;
//		
//		int (d === 1) {
//			int aaa = 10;
//			int bbb = aaa + d;
//			System.out.println("bbb :" + bbb);
//		} else {
//			  
//		}
//		
//		System.out.println("aaa :" + aaa); 변수가 블럭 안에 있기 때문에 안에서만 사용 가능 
//		System.out.println("aaa :" + bbb); 변수가 블럭 안에 있기 때문에 안에서만 사용 가능 
//		System.out.println("d :" + d); 변수가 블럭 밖에 있어서 밖에서 사용 가능 
	
		
	}

}
