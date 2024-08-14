package tr.ch06;

public class Suv {
	
	public String cash(String position) {
		
		String cash01 = "";
		
		switch (position) {
		case "사장" : {
			cash01 = "연봉은 10원 입니다.";
			break;
		}
		case "부장" : {
			cash01 = "연봉은 100원 입니다.";
			break;
		}
		case "과장" : {
			cash01 = "연봉은 100원 입니다.";
			break;
		}
		default :
			cash01 = "직급을 다시 입력해주세요.";
			break;	
		}
		
		return cash01;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
