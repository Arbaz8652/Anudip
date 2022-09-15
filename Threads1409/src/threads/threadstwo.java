package threads;

public class threadstwo implements Runnable
{
	StringBuilder sb;
	StringBuffer sf;

	public threadstwo(StringBuilder sb, StringBuffer sf) {
		super();
		this.sb = sb;
		this.sf = sf;
	}
	

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			sb.append("abz");
			System.out.println(sb);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
