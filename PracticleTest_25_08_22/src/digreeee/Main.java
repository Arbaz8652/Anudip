package digreeee;

public class Main {
	static int dcount=0;
	static int pcount=0;
	static int ucount=0;
	static int countObjects(Digree digree) {
		if (digree instanceof Digree) {
			dcount++;
			return dcount;
		}
		if(digree instanceof PostGradss) {
			pcount++;
			return pcount;
		}if(digree instanceof UnderGrads) {
			ucount++;
			return ucount;
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		Digree dg= new Digree();
		dg.getDigree();
		
		Digree pg=new PostGradss();
		pg.getDigree();
		
		Digree ug= new UnderGrads();
		ug.getDigree();
		
		int count = Main.countObjects(dg);
		System.out.println("Digree obj count is "+count);
		
		count = Main.countObjects(pg);
		System.out.println("post Grad obj count is "+count);
		count = Main.countObjects(ug);
		System.out.println("Undergrad obj count is "+count);
		
		
		

	}
}
