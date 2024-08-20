package ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Hello", 10);
		
		// 출력1
		map.forEach((key, value) -> {
			System.out.println(key + ", " + value);
		});
		
		// 출력2 
		for(String strKey : map.keySet() ) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + ", " + strValue);
		}
 
	}

}
