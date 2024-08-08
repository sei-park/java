package ch07.third;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		
		this.name = name;
		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		
	}

	@Override
	void sayName() {
		if(studentNo >= 21) {
			super.sayName();
		} else {
			System.out.println("*");
		}
	}
	

}
