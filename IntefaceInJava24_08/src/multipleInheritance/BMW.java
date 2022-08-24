package multipleInheritance;

public class BMW implements ICarRunning, ICarStop {
	private String brand;
	private String carType;
	private int carSpeed;
	private String carColor;
	private int carPrice;
	private int carMilage;
	private int carModelYear;
	private int carPasangerCap;
	
	public BMW(
		String brand, 
		String carType,
		String carColor,
		int carSpeed,
		int carPrice,
		int carMilage,
		int carModelYear,
		int carPasangerCap)
	{	
		this.brand=brand;
		this.carType=carType;
		this.carColor=carColor;
		this.carSpeed=carSpeed;
		this.carPrice=carPrice;
		this.carMilage=carMilage;
		this.carModelYear=carModelYear;
		this.carPasangerCap=carPasangerCap;
	}

	@Override
	public void carBrand() {
		System.out.println("Brand  =  "+brand);
		
	}

	@Override
	public void carType() {
		System.out.println("Type  =  "+carType);
	}

	@Override
	public void carColor() {
		System.out.println("Color  =  "+carColor);
	}

	@Override
	public void carPrice() {
		System.out.println("Price  =  "+carPrice);
	}

	@Override
	public void carSpeed() {
		System.out.println("Max Speed is  =  "+carSpeed);
	}

	@Override
	public void carMilage() {
		System.out.println("Car Milage is  =  "+carMilage);
	}

	@Override
	public void carModelYear() {
		System.out.println("Model Year  =  "+carModelYear);
	}

	@Override
	public void carPasangerCap() {
		System.out.println("Pasanger Capacity is   =  "+carPasangerCap);
	}

}
