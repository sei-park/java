package ch12;

import java.awt.Toolkit;

public class BeepRunnable implements Runnable {

	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		} 
	}

}
