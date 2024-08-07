package tr;

public class MobilePhoneEx {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		// 부모 클래스의 메소드를 사용
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		// 오버라이드 
		// 부모 클래스의 bell() 메소드를 제정의 
		dmbCellPhone.bell();
		
		Mobile mobile = new Mobile();
		
		mobile.aaa();
		mobile.powerOn();
		mobile.powerOff();
		
		// 오버라이드
		mobile.bell();
		
		
		
	}

}
