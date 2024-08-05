package tr;

public class Suv {

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
			cash01 = "연봉은 100원입니다.";
			break;
		}
		case "과장": {
			cash01 = "연봉은 1000원입니다.";
			break;
		}
		case "대리": {
			cash01 = "연봉은 5,000원입니다.";
			break;
		}
		case "주임": {
			cash01 = "연봉은 6,000입니다.";
			break;
		}
		case "사원": {
			cash01 = "연봉은 7,000입니다.";
			break;
		}
		case "나": {
			cash01 = "연봉은 8,000원입니다.";
			break;
		}
		default: {
			cash01 = "직급을 다시 입력해주세요.";
			break;
		}
		
		}
		return cash01;

	}

}
