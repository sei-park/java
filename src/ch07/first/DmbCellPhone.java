package ch07.first;

public class DmbCellPhone extends CellPhone {
	
	// 부모 클래스 : CellPhone / 자식 클래스 : DmbCellPhone 
	
	// 오버라이드 : 부모클래스를 자식클래스에서 재정의 하는 것
	// 클래스에서 마우스 오른쪽 클릭 -> Source -> Override/Implement Methods 
	// -> 오버라이드 할 내용 선택
	@Override
	void powerOn() {
		System.out.println("자식의 전원을 켭니다.");
	}
	
	// child class
	// 필드
	public int channel;
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel);
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel);
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
	
	

}
