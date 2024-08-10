package ch07.fifth;

public class PhoneEx extends Phone {

	@Override
	public void open() {
		System.out.println("Hello");
	}
	
	// 추상클래스를 상속하는 자식 클래스에서 
	// 부모가 가진 메소드를 모두 오버라이딩 해야 

	public static void main(String[] args) {
		
		PhoneEx phoneEx = new PhoneEx();
		
		phoneEx.open();
	} 
	

}
