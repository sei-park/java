package ch13.second;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<String, Integer> product = new Product<>();
		
		product.setKind("sei");
		product.setModel(10);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		// Tv = 객체
		Product<Tv, String> product2 = new Product<>();
	}

}
