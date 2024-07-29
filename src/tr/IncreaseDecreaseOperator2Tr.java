package tr;

public class IncreaseDecreaseOperator2Tr {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		++i; // 2
		j++; // 2 
		
//		System.out.println(i);
//		System.out.println(j);
		
		int a = ++i;
		int b = j++; 
		
		System.out.println(a); // 3
		System.out.println(i); // 3
		System.out.println(b); // 2
		System.out.println(j); // 3 
	}

}
