package tr;

public class DmbCellPhone extends CellPhone {

	@Override
	void bell() {
		System.out.println("자식 클래스의 벨이 울립니다.");
	}
	
	// CellPhone : 부모클래스
	// DmbCellPhone : 자식클래스

}
