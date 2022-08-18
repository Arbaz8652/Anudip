package question2.model;

public class Pattern {
	
	public void pattern(){
		
		for (int i=0; i<7; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print(j*(i+1)+" ");
			}
			System.out.println();
		}
	}
}
