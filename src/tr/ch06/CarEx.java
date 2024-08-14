package tr.ch06;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println(car.engine);
		System.out.println(car.name);
		
		car.go();
		car.back();
		
	}

}
