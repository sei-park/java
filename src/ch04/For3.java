package ch04;

public class For3 {

	public static void main(String[] args) {
		
		// 10*5
		char star = '*';
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// (1,10) 번째 출력
		char empty = ' ';
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 5) {
					System.out.print(star); 
				}
				if (i == 2 || i == 3 || i == 4) {
					if (j == 1 || j == 10) { 
						System.out.print(star);
						for (int k = 1; k <= 8; k++) {
							System.out.print(empty);
						}
					}
				}
			}
			System.out.println();
		} 
		
		System.out.println("----------");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i >= 2 && i <= 4) {
					if(j >= 2 && j <= 9) { 
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		 
		System.out.println("----------");
			 
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) { 
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for(int i = 1; i <= 10; i++) {
			if(i == 10) {
				for(int j = 1; j <= i; j++) {
					if(j % 2 == 1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	
		

	} 

}
