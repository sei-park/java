package tr;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println(car.engine);
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.company);
		
		car.go();
		car.back();
		
	}

}
