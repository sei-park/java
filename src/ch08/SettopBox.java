package ch08;

public class SettopBox implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("SettopBox를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SettopBox를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
