package ch13.first;

public class BoxEx {

	public static void main(String[] args) {
		
		// <> 안에는 데이터 타입이나 객체가 들어갈 수 있음 
		
		Box<String> box = new Box<>();
		box.setT("Hello");
		System.out.println(box.getT());
		
		Box<Integer> box2 = new Box<>();
		box2.setT(10);
		System.out.println(box2.getT());
	}

}
