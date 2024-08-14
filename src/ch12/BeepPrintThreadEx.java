package ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		
//		Thread thread = new Thread(new Runnable(){
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i = 0; i < 5; i++) {
//					
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//		 				e.printStackTrace();
//					}
//				} 
//			}
//			
//		});
//		
//		thread.start();
		
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("sei");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		}
		
	
		
		

		
	}

}
