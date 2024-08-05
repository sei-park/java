package tr;

public class SuvEx {

	public static void main(String[] args) {
		
		Suv suv = new Suv();
		
		int resultPrint = suv.sum(1, 2);
		System.out.println("a + b = " + resultPrint);
		
		String resultPrint02 = suv.cash("사원");
		System.out.println(resultPrint02);
	} 

}
