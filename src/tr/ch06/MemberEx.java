package tr.ch06;

public class MemberEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setName("park sei");
		System.out.println("name : " + member.getName());
		
		member.setAge(29);
		System.out.println("age : " + member.getAge());
		
		member.aaa();
		 
	}

}
