package entrFace;
public class Triangle implements Drwable {
	private double side1, side2, side3;
	
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}

	@Override
	public double getArea() {
		double temp=(side1+side2+side3)/2;
		return Math.sqrt(temp*(temp-side1)*(temp-side2)*(temp-side3));
	}
	

	public String toString() {
		return "This is a object Triangle class";
	}
	
}
