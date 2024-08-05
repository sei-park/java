package ch06.first;

public class Suv {
	
	int engine = 6;
	String name = "아이오닉5";
	String color = "블루";
	String company = "현대자동차";
	
	void go() {
		System.out.println("go");
	}
	
	void back() {
		System.out.println("back");
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public String cash(String position) {
		
		String cash01 = "";
				 
		switch (position) {
		case "사장": {
			cash01 = "연봉은 10원 입니다.";
			break;
		}
		case "부장": {
			cash01 = "연봉은 100원 입니다.";
			break;
		}
		case "과장": {
			cash01 = "연봉은 1000원 입니다.";
			break;
		}
		case "대리": {
			cash01 = "연봉은 5,000 입니다.";
			break;
		}
		case "주임": {
			cash01 = "연봉은 6,000 입니다.";
			break;
		}
		case "사원": {
			cash01 = "연봉은 7,000 입니다.";
			break;
		}
		case "나": { 
			cash01 = "연봉은 8,000 입니다.";
			System.out.println();
			break;
		}
		default:
			cash01 = "직급을 다시 입력해주세요.";
			break;
		}
		 
		return cash01;
	}
	
	
}
