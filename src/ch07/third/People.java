package ch07.third;

public class People {
	
	public String name;
	public String ssn;
	
	// 부모에 생성자가 존재
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public People() {
		
	}
	
	void sayName() {
		System.out.println(name);
	}
	

}
