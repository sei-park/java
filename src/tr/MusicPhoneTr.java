package tr;

public class MusicPhoneTr extends PhoneTr {
	
	@Override
	void phoneCall() {
		System.out.println("전화 걸기333");
	}

	@Override
	void takePhpneCall() {
		System.out.println("전화 받기333");
	}

	@Override
	void connect() {
		System.out.println("무선 기지국 연결333");
	}

	@Override
	void charge() {
		System.out.println("충전하기33");
	}

	void musicDownload() {
		System.out.println("음악 다운");
	}
	
	void playMusic() {
		System.out.println("음악 재생");
	}

}
