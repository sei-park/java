package ch02;

public class CastingEx {

	public static void main(String[] args) {
		
		double doubleVal = 10;
		
		// 형 변환(casting)
		float floatVal = (float) doubleVal;
		System.out.println("floatVal : " + floatVal);
		
		long longVal = (long) floatVal;
		System.out.println("longVal : " + longVal);
		
		int intVal = (int) longVal;
		System.out.println("intVal : " + intVal);
		
		short shortVal = (short) intVal;
		System.out.println("shortVal : " + shortVal);
		
		byte byteVal = (byte) shortVal;
		System.out.println("byteVal : " + byteVal);
		
		
		String val = "10";
		int var2 = 10;
		int result = 0;
		
		// 정수로 형변환 
		result = Integer.parseInt(val) + var2;
		System.out.println("result : " + result);
		 
	}

}
