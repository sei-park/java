package ch06.second;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("car2.color : " + car.color);
		
		Car car2 = new Car("Black");
		System.out.println("car2.color : " + car2.color);
		
		Car car3 = new Car(12,"로마","Red","페라리");
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.compnay : " + car3.company);
		
		Car car4 = new Car(4,"그랜다이져","White","현대자동차");
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.compnay : " + car4.company);
		System.out.println("car4.name : " + car4.name);
		
		// car4의 name 을 바꿈 
		car4.name = "g80";
		System.out.println("car4.name : " + car4.name);
	}

}
