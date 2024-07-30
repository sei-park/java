package ch04;

public class If2 {

	public static void main(String[] args) {
		
		// 일반:1 5% 할인 
		// 브론즈:2 10% 할인 
		// 실버:3 15% 할인 
		// 골드:4 20% 할인
		// 플래티넘:5 27% 할인 
		
		// 정가가 12000원인 실버 등급의 할인가는 10200원 입니다. 
		
		int grade = 3; // 등급
		int cost = 12000; // 정가
		int disCount = 0; // 할인가 
	
		double salesCost = 0.0;
		 
		if (grade == 1) {  
			salesCost = cost * 0.05;  
			disCount = cost - (int)salesCost;
			System.out.println("정가가 " + cost  + "인" + " 일반 등급의 할인가는 " + disCount + "입니다.");
		} else if (grade == 2) {
			salesCost = cost * 0.01;
			disCount = cost - (int)salesCost;
			System.out.println("정가가 " + cost + "인" + " 일반 등급의 할인가는 " +  disCount + "입니다.");
		} else if (grade == 3) {
			salesCost = cost * 0.15;
			disCount = cost - (int)salesCost;
			System.out.println("정가가 " + cost + "인" + " 일반 등급의 할인가는 " +  disCount + "입니다.");
		} else if (grade == 4) { 
			salesCost = cost * 0.2;
			disCount = cost - (int)salesCost;
			System.out.println("정가가 " + cost + "인" + " 일반 등급의 할인가는 " +  disCount + "입니다.");
		} else if (grade == 5) {
			salesCost = cost * 2.7;
			disCount = cost - (int)salesCost;
			System.out.println("정가가 " + cost + "인" + " 일반 등급의 할인가는 " +  disCount + "입니다.");
		} else {
			System.out.println("할인이 없습니다.");
		}
		
		
//		
//		
//		if(grade == 1) {
//			salesCost = cost * (1-0.05);
//			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 2) {
//			salesCost = cost * (1-0.1);
//			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 3) {
//			salesCost = cost * (1-0.15);
//			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 4) {
//			salesCost = cost * (1-0.2);
//			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if (grade == 5) {
//			salesCost = cost * (1-0.027);
//			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else {
//			System.out.println("1~5 까지의 grade 만 가능합니다.");
//		}
		 
	}

}
