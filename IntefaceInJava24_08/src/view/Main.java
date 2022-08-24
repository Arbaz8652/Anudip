package view;
import entrFace.*;
public class Main {
	public static void main(String[] args) {
		//Creating Objects for each class
		Rectangle rect=new Rectangle(30,20);
		System.out.println(rect.toString());
		rect.draw();
		System.out.println("Area = "+rect.getArea());
		System.out.println(rect.getPerimeter(20,30));
		
		System.out.println("\n============================================================");
		Triangle tri = new Triangle(12.0,24.0,23.0);
		System.out.println(tri.toString());
		tri.draw();
		System.out.println("Area = "+tri.getArea());
		System.out.println(rect.getPerimeter(12,24,23));
		
		System.out.println("\n============================================================");
		Circle cr=new Circle(1);
		System.out.println(cr.toString());
		cr.draw();
		System.out.println("Area = "+cr.getArea());
		//System.out.println(rect.getPerimeter(null));
	}
}
