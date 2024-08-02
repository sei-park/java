package ch05.array;

public class Array2 {

	public static void main(String[] args) {
		
		// kor, eng, math 과목별 종합과 평균 
		// 사람별 종합과 평균 
		
		String[] name = {"장동건", "차태식", "마동석", "마장동", "마해영"};
		
		int[][] score = {{99, 88, 55}, {55, 77, 66}, {55, 55, 44}, {55, 55, 44}, {55, 55, 77}};
		
		// 데이터 넣기
		score[0][0] = 100;
		
		// 데이터 꺼내기
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println("score["+ i + "][" + j + "]: " + score[i][j]);
			}
		}
		
	
		
		
	}

}
