package multipleInheritance;

public class Lamborghini implements ISportCar,ICarRunning{
	private int carSpeed;
	private int carMilage;
	private int carModelYear;
	private int carPasangerCap;
	private int maxSpeed;
	private int zeroTo100;
	private boolean isTurbo;
	private String carBrand;
	
	public Lamborghini(
			int carSpeed,
			int carMilage,
			int carModelYear,
			int carPasangerCap,
			int maxSpeed,
			int zeroTo100,
			boolean isTurbo,
			String carBrand)
	{
		this.carSpeed=carSpeed;
		this.carMilage=carMilage;
		this.carModelYear=carModelYear;
		this.carPasangerCap=carPasangerCap;
		this.maxSpeed=maxSpeed;
		this.zeroTo100=zeroTo100;
		this.isTurbo=isTurbo;
		this.carBrand=carBrand;
	}
	public void carBrand() {
		System.out.println("Brand  =  "+carBrand);
		
	}
	@Override
	public void carSpeed() {
		System.out.println("Car Speed = "+carSpeed);
	}

	@Override
	public void carMilage() {
		System.out.println("Car Milage = "+carMilage);
	}

	@Override
	public void carModelYear() {
		System.out.println("Car Model Year = "+carModelYear);
	}

	@Override
	public void carPasangerCap() {
		System.out.println("Pasanger Capacity = "+carPasangerCap);
	}

	@Override
	public void maxSpeed() {
		System.out.println("Max Speed = "+maxSpeed);
	}

	@Override
	public void zeroTo100() {
		System.out.println("0 to 100 in = "+zeroTo100+" Seconds");
	}

	@Override
	public void isTurbo() {
		System.out.println("Is Car Turbo Charged = "+isTurbo);
	}

}
