package ch13.first;

public class Box<T> {
	
	// Generic
	// 하나의 클래스에서 여러 데이터 타입을 가질 수 있도록 함 
	// 데이터 타입을 미리 지정하지 않고 사용할 때 지정해서 사용
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	

}
