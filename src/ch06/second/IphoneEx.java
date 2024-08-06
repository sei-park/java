package ch06.second;

public class IphoneEx {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(2967);
		System.out.println("iphone.cpu : " + iphone.cpu);
		
		Iphone iphone2 = new Iphone(2967,256);
		System.out.println("iphone2.cpu : " + iphone2.cpu);
		System.out.println("iphone2.cpu : " + iphone2.memory);
		
		Iphone iphone3 = new Iphone(2967,256,"White");
		System.out.println("iphone3.cpu : " + iphone3.cpu);
		System.out.println("iphone3.memory : " + iphone3.memory);
		System.out.println("iphone3.color : " + iphone3.color); 
		   
	}

}
