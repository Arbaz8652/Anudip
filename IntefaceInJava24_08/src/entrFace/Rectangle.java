package entrFace;

public class Rectangle implements Drwable  {
	private int length, width; 
	private double area;
	
	public Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Rectanle");	
	}

	@Override
	public double getArea() {
		area=(double)length*width;
		return area;
	}
	
	public String toString() {
		return "This is a object Rectangle class";
	}

	

}
