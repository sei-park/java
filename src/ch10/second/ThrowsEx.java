package ch10.second;

public class ThrowsEx {

	public static void main(String[] args) throws ClassNotFoundException {
		
		aaa();

	}
	
	public static void aaa() throws ClassNotFoundException {
		
		// 예외를 메인함수로 넘김
		// 예외를 메서드를 호출한 곳에서 처리하도록 넘기는 것 
		Class clazz = Class.forName("ExTry");
		
	}
	

}
