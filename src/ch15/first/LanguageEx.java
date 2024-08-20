package ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		
		Language language1 = new Language("Korea", 82);
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("Japan", 20);
		
		List<Language> languages = new ArrayList<>();
		
		// 객체를 수정할 때 어려움이 있음 
		// ArrayList<Language> languages = new ArrayList<>();
		
		// Language 객체가 생성되었기 때문에 Language 객체만 담을 수 있음 
		languages.add(language1);
		languages.add(language2);
		languages.add(language3);
		
		// 변수를 사용하지 않고 값을 넣는 방법 
		languages.add(new Language("England", 30));
		
		// languages 에서 index 3번째의 이름을 변경 
		languages.get(3).name = "UK";
		
		for(int i = 0; i < languages.size(); i++) {
			System.out.println("languages.get(" + i +").name : " + languages.get(i).name);
		}
		
		System.out.println();
		
		// 향상된 for 문
		// for(데이터 타입 변수명 : 콜렉션 변수명)
		for(Language language : languages) {
			System.out.println("language.name : " + language.name);
		}
		
		
		System.out.println("----------");
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Hyunds", 1000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 3000));
		
		for(Car car : cars) {
			System.out.println("language.name: " + car.getName());
		}
		
		
		
		
		
		
	}

}
