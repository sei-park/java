package ch04;

public class If1 {

	public static void main(String[] args) {
		
		int score = 89;
		
//		if (score >= 90) {
//			System.out.println(score + "점은 A 입니다.");
//		} else if (score >= 80) {
//			System.out.println(score + "점은 B 입니다.");
//		} else if (score >= 70) {
//			System.out.println(score + "점은 C 입니다.");
//		} else if (score >= 60) {
//			System.out.println(score + "점은 D 입니다.");
//		} else {
//			System.out.println(score + "점은 F 입니다.");
//		}
		
//		if (score <= 100 && score >= 90) {
//			System.out.println(score + "점은 A 입니다.");
//		} else if (score <= 89 && score >= 80) {
//			System.out.println(score + "점은 B 입니다.");
//		} else if (score <= 79 && score >= 70) {
//			System.out.println(score + "점은 C 입니다.");
//		} else if (score <= 69 && score >= 60) {
//			System.out.println(score + "점은 D 입니다.");
//		} else {
//			System.out.println(score + "점은 F 입니다.");
//		}
		
		
		if (score >= 90) {
			if (score <= 100 && score >= 97) {
				System.out.println(score + "점은 A+ 입니다.");
			} else if (score <= 96 && score >= 93 ) {
				System.out.println(score + "점은 A 입니다.");
			} else if (score <= 92 && score >= 90 ) {
				System.out.println(score + "점은 A- 입니다.");
			}
		} else if (score >= 80) {
			if (score <= 89 && score >= 87) {
				System.out.println(score + "점은 B+ 입니다.");
			} else if (score <= 86 && score >= 83 ) {
				System.out.println(score + "점은 B 입니다.");
			} else if (score <= 82 && score >= 80 ) {
				System.out.println(score + "점은 B- 입니다.");
			}
		} else if (score >= 70) {
			if (score <= 79 && score >= 77) {
				System.out.println(score + "점은 C+ 입니다.");
			} else if (score <= 76 && score >= 73 ) {
				System.out.println(score + "점은 C 입니다.");
			} else if (score <= 72 && score >= 70 ) {
				System.out.println(score + "점은 C- 입니다.");
			}
		} else if (score >= 60) {
			if (score <= 69 && score >= 67) {
				System.out.println(score + "점은 D+ 입니다.");
			} else if (score <= 66 && score >= 63 ) {
				System.out.println(score + "점은 D 입니다.");
			} else if (score <= 62 && score >= 60 ) {
				System.out.println(score + "점은 D- 입니다.");
			}
		} else {
			System.out.println(score + "점은 F 입니다.");
		}
		
	
		
		 
	}

}
