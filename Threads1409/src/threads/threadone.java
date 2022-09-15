package threads;

public class threadone implements Runnable{

	
	StringBuilder sb;
	StringBuffer sf;

	public threadone(StringBuilder sb, StringBuffer sf) {
		super();
		this.sb = sb;
		this.sf = sf;
	}
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			System.out.println(sf.append("abz"));
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
