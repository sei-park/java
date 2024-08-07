package ch07.first;

public class MobilePhoneEx {

	public static void main(String[] args) { 
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		// 부모클래스에 있는 내용을 자식클래스가 상속 받아 쓸 수 있음
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.powerOn(1);
		
		// 오버라이드 
		dmbCellPhone.powerOn();
		
		Mobile mobile = new Mobile();
		
		System.out.println("----------");
		
		mobile.powerOff();
		mobile.changeChannelDmb(1);
		mobile.aaa();
		
		
	}

}
