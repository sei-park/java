package tr.ch06Tr;

public class IphoneEx {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(2967);
		System.out.println(iphone.cpu);
		
		Iphone iphone2 = new Iphone(2967,"256GB");
		System.out.println(iphone2.cpu);
		System.out.println(iphone2.memory);
		
		Iphone iphone3 = new Iphone(2967,"256GB","실버");
		System.out.println(iphone3.cpu);
		System.out.println(iphone3.memory);
		System.out.println(iphone3.color);
		
		
		
		
	}

}
