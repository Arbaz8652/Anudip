package question2.thread;

public class Welcome implements Runnable{

	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.err.println("Wecome Threde.");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
