package ch06.first;


public class SuvEx {

	public static void main(String[] args) {
		
		Suv suv = new Suv();
		
		System.out.println("suv.engine : " + suv.engine);
		System.out.println("suv.name : " + suv.name);
		System.out.println("suv.color : " + suv.color);
		System.out.println("suv.company : " + suv.company);
		
		suv.go();
		suv.back();
		
		System.out.println("------");
		
		int result01= suv.sum(1, 2); // return 이 있는 함수는 값을 받을 변수가 필요함
		System.out.println("a + b = " + result01);
		
		System.out.println("------");
		
		String result02 = suv.cash("나");
		System.out.println(result02);
		


		

		
	 
	}

}
