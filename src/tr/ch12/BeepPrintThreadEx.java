package tr.ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("sei");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
