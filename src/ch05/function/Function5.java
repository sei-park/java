package ch05.function;

public class Function5 {

	public static void main(String[] args) {
		
		// 사장, 부장, 과장, 대리, 사원, 나
		// 직급에 따른 연봉을 알려주는 함수
	
		String result = cash();
		
	}
	
	public static String cash() { 
		
		String position = "나";
		
		switch (position) {
		case "사장": {
			System.out.println("연봉은 10원 입니다.");
			break;
		}
		case "부장": {
			System.out.println("연봉은 100원 입니다.");
			break;
		}
		case "과장": {
			System.out.println("연봉은 1000원 입니다.");
			break;
		}
		case "대리": {
			System.out.println("연봉은 5,000 입니다.");
			break;
		}
		case "주임": {
			System.out.println("연봉은 6,000 입니다.");
			break;
		}
		case "사원": {
			System.out.println("연봉은 7,000 입니다.");
			break;
		}
		case "나": {
			System.out.println("연봉은 8,000 입니다.");
			break;
		}
		default:
			System.out.println("직급을 다시 입력해주세요.");
			break;
		}
		
		return position;
		
	}

	
	
	
	
	
	
}
