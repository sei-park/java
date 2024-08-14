package ch12;

import java.awt.Toolkit; // 단축키 : ctrl + shift + o 

public class BeepEx {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 다섯번 소리 나게 함  
			 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
			
		}
		
	}

}
