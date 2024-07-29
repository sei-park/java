package ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {
		
		// 증감 연산자(++, --)
		
		int i = 7; 
		int j = 8; 
		
		++i; 
		j++; 
		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("----------");
		
		int a = ++i;
		int b = j++;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("----------");
		
		System.out.println("i :" + i);
		System.out.println("j : " + j);
		System.out.println("----------");
		
		--i;
		int z = ++i + j++;
		System.out.println("z : " + z);
		System.out.println("i :" + i);
		System.out.println("j :" + j);
	}

}
