package question1.model;

public class Customer {

	private int Id;
	private String Name;
	private int Age;
	
	//consttructor without parameter
	public Customer(){
		Id=543;
		Name="Arbaaz";
		Age=17;
	}
	
	//Parameter constructor
	public Customer(int id, String name, int age) {
		Id=id;
		Name=name;
		Age=age;
	}
	
	//Getters
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public double getAge() {
		return Age;
	}
	
	//Setter
	public void setId(int id) {
		Id=id;
	}
	public void setName(String name) {
		Name=name;
	}
	public void setAge(int age) {
		Age=age;
	}
	
}
