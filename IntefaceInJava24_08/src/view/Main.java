package view;
import entrFace.*;
import multipleInheritance.*;
public class Main {
	public static void main(String[] args) {
		//Creating Objects for each class
//		Rectangle rect=new Rectangle(30,20);
//		System.out.println(rect.toString());
//		rect.draw();
//		System.out.println("Area = "+rect.getArea());
//		System.out.println(rect.getPerimeter(20,30));
//		
//		System.out.println("\n============================================================");
//		Triangle tri = new Triangle(12.0,24.0,23.0);
//		System.out.println(tri.toString());
//		tri.draw();
//		System.out.println("Area = "+tri.getArea());
//		System.out.println(rect.getPerimeter(12,24,23));
//		
//		System.out.println("\n============================================================");
//		Circle cr=new Circle(1);
//		System.out.println(cr.toString());
//		cr.draw();
//		System.out.println("Area = "+cr.getArea());
		//System.out.println(rect.getPerimeter(null));
		
		
		
		
		
		// For Car Class
		// brand, carType, carColor, carSpeed, carPrice, carMilage, carModelYear, carPasangerCap
		BMW bmw=new BMW("BMW X8", "Sadan", "Purple", 300, 1200000, 12, 2019, 2);
		bmw.carBrand();
		bmw.carColor();
		bmw.carMilage();
		bmw.carModelYear();
		bmw.carPasangerCap();
		bmw.carPrice();
		bmw.carSpeed();
		bmw.carType();
		System.out.println("\n============================================================");
//		 carSpeed, carMilage, carModelYear, carPasangerCap, maxSpeed, zeroTo100, isTurbo
		Lamborghini lmb=new Lamborghini(330, 8, 2020, 2, 360, 3, true,"Lamborghini 202H");
		lmb.carBrand();
		lmb.carMilage();
		lmb.carModelYear();
		lmb.carPasangerCap();
		lmb.carSpeed();
		lmb.maxSpeed();
		lmb.zeroTo100();
		lmb.isTurbo();
	}
}
