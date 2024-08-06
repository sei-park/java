package ch06.first;

public class CarEx {

	public static void main(String[] args) {
		
		// 객체 사용 
		Car car = new Car(); // 변수는 클래스 이름과 같게 함 
		
		System.out.println("car.engine : " + car.engine);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color: " + car.color);
		System.out.println("car.company : " + car.company);
		
		// 함수 사용 
		car.go();
		car.back();
		
	}

}
