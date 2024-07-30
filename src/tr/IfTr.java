package tr;

public class IfTr {

	public static void main(String[] args) {
		
		// 점수에 맞는 등급 구하기 
		int score = 85;
		
		if (score <= 100 && score >= 90) {
			System.out.println("A");
		} else if (score <= 89 && score >= 80) {
			System.out.println("B");
		} else if (score <= 79 && score >= 70) {
			System.out.println("C");
		} else if (score <= 69 && score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// 일반:1 5% 할인 
		// 브론즈:2 10% 할인 
		// 실버:3 15% 할인 
		// 골드:4 20% 할인
		// 플래티넘:5 27% 할인 
		
		// 정가가 12000원인 실버 등급의 할인가는 10200원 입니다.
		int grade = 3; // 등급
		int cost = 12000; // 정가

		double salesCost = 0.0; // 할인 % 
		
		if (grade == 1) {
			salesCost = cost * (1 - 0.05);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "입니다.");
		} else if (grade == 2) {
			salesCost = cost * (1 - 0.1);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "입니다.");
		} else if (grade == 3) {
			salesCost = cost * (1 - 0.15);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "입니다.");
		} else if (grade == 4) {
			salesCost = cost * (1 - 0.2);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "입니다.");
		} else if (grade == 5) {
			salesCost = cost * (1 - 0.027);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "입니다.");
		} else {
			System.out.println("1~5 까지의 grade 만 가능합니다.");
		}
		
		// 정수가 짝수인지 홀수인지 판단하기 
		
		int a = 2;
		
		if (a % 2 == 0) {
			System.out.println(a + "는 " + "짝수입니다.");
		} else { 
			System.out.println(a + "는 " + "홀수입니다.");
		}
		
		// int 타입 변수 2개 선언
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램
		
		int b = 1;
		int c = 2; 
		
		if (a > 0 && b > 0) {
			System.out.println("(a,b)는 1사분면에 위치합니다." );
		} else if (a < 0 && b > 0) {
			System.out.println("(a,b)는 2사분면에 위치합니다." );
		} else if (a < 0 && b < 0) {
			System.out.println("(a,b)는 3사분면에 위치합니다." );
		} else if (a > 0 && b < 0) {
			System.out.println("(a,b)는 4사분면에 위치합니다." );
		}
		
		// int 타입 변수 3개 선언
		// 세 정수 중에 최대값, 최소값을 구하는 프로그램
		
		int i = 3;
		int j = 2; 
		int k = 1; 
		
		if (i != j && j != k && i != k) {
			if (i > j && i > k) {
				System.out.println("최대값은 : " + i);
			} else if (j > i && j > k) {
				System.out.println("최대값은 : " + j);
			} else {
				System.out.println("최대값은 : " + k);
			}
			
			
			if (i < j && i < k) {
				System.out.println("최소값은 : " + i);
			} else if (j < i && j < k) {
				System.out.println("최소값은 : " + j);
			} else {
				System.out.println("최소값은 : " + k);
			}
			
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
		
	
		
	} 

}
