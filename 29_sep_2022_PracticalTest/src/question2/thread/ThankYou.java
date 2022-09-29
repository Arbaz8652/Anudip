package question2.thread;

public class ThankYou implements Runnable {

	@Override
	public void run() {
		for (int i=1; i<=3; i++) {
			System.err.println("Thank You.");
			try {
				Thread.sleep(40000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
