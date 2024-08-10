package ch07.fifth;

public abstract class Phone {
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}
	
	// 추상 메소드가 하나 이상 포함되면 추상클래스로 선언 되어야 함
	// 추상클래스에서 추상 메소드가 아닌 일반 메소드 포함 가능 
	
	// 추상클래스 안의 메소드를 미완성으로 남겨 놓는 이유는 
	// 추상클래스를 상속 받는 자식클래스의 주제에 따라 
	// 상속 받는 메소드의 내용이 달라질 수 있기 때문
	// 실제 내용은 상속 받는 클래스에서 구현하도록 하기 위해 일부러 비워둠
	
	public abstract void open(); // 추상 메소드 
	

	
	

}
