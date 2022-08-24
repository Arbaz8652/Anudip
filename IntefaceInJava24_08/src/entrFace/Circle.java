package entrFace;

public class Circle implements Drwable{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	@Override
	public double getArea() {
		return Math.PI*(radius* radius);
	}
	

	public String toString() {
		return "This is a object Circle class";
	}
	

}
