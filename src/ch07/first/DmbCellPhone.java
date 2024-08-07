package ch07.first;

public class DmbCellPhone extends CellPhone {
	
	// 부모 클래스 : CellPhone / 자식 클래스 : DmbCellPhone 
	
	
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
