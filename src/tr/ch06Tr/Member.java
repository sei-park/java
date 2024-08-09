package tr.ch06Tr;

public class Member {
	
	public String getName() {
		return name; 
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;
	
	void aaa() {
		System.out.println("aaa : " + this.name);
		System.out.println("aaa2 : " + age); 
	}
	
	
	
	
	
	
	
	

}
