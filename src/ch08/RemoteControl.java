package ch08;

public interface RemoteControl { 
	
	// 인터페이스 사용 이유 
	// 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위함
	 
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name = "ansdf";
	
	// 추상 메서드(가장 많이 쓰임)
	// abstract 생략 가능 
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default : 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static : 정적 메서드
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
	

}
