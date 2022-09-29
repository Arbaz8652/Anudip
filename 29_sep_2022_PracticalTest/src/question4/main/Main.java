package question4.main;

import java.util.List;
import java.util.stream.Collectors;

import question4.model.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> products=List.of(
				new Product("Iphone", 523020, 650.0),
				new Product("SamSung Galaxy", 320480, 79.0),
				new Product("Oppo", 620598, 499.0),
				new Product("RealMe", 210798, 150.0),
				new Product("Xiaomi", 120238, 199.0)
				);
		
		// Product having max price;
		System.out.println("Product having max price");
		List<Product> p=products.stream()
				.sorted((a,b)->(a.getProductPrice().compareTo(b.getProductPrice())))
				.collect(Collectors.toList());
		System.out.println(p.get(p.size()-1));
		System.out.println();
		
		
		// Product having lowest Price
		System.out.println("Product having lowest Price");
		System.out.println(p.get(0));
		System.out.println();
		
		
		// Product Name Start with "S"
		System.out.println("Product Name Start with \"S\"");
		products.stream().filter(T->T.getProductName().charAt(0)=='S').forEach(System.out::println);;
		System.out.println();
		
		
		// Price between 100 &200
		
		System.out.println("Product Having Price between 100 & 200");
		List<Product> priceRange=products.stream()
				.filter(T->(T.getProductPrice()>100 && T.getProductPrice()<200))
				.collect(Collectors.toList());
		priceRange.forEach(T->System.out.println(T.toString()));

		
	}

}
