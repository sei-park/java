package tr;

public class Mobile extends DmbCellPhone {
	
	public void aaa() {
		System.out.println("Hello");
	}

	@Override
	void bell() {
		System.out.println("자식 클래스의 벨이 울립니다.222");
	}
	
	

}
