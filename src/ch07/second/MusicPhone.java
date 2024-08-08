package ch07.second;

public class MusicPhone extends Phone { 

	@Override
	public void phoneCall() {
		System.out.println("전화를 걸다.333");
	}

	@Override
	public void takePhoneCall() {
		System.out.println("전화를 받다.333");
	}

	@Override
	public void connect() {
		System.out.println("무선 기지국 연결333");
	}

	@Override
	public void charge() {
		System.out.println("배터리 충전333");
	}

	public void musicDownload() {
		System.out.println("음악 다운");
	}
	
	public void playMusic() {
		System.out.println("음악 재생");
	}

}
