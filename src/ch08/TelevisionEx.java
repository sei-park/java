package ch08;

public class TelevisionEx {

	public static void main(String[] args) {
		
		// interface 클래스를 가져옴
		// 객체만 바꾸면 내용을 전부 바꿀 수 있음
		
		// RemoteControl remoteControl = new Television();
		RemoteControl remoteControl = new SettopBox();
		
		remoteControl.turnOn(); 
		remoteControl.turnOff();

		// remoteControl.setVolume(11);
	}

}
