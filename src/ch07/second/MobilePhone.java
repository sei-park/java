package ch07.second;
 
public class MobilePhone extends Phone {

	@Override
	public void phoneCall() {
		System.out.println("전화를 걸다.222");
	}

	@Override
	public void takePhoneCall() {
		System.out.println("전화를 받다.222");
	}

	@Override
	public void connect() {
		System.out.println("무선 기지국 연결222");
	}

	@Override
	public void charge() {
		System.out.println("배터리 충전222");
	}
	



}
