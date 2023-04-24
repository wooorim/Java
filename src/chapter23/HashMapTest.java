package chapter23;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "사과");
			map.put(2, "바나나");
			map.put(3, "포도");
			
			System.out.println(map);
			System.out.println(map.get(1));
			
			for(Entry<Integer, String> entry : map.entrySet())
				System.out.println("[Key]: " + entry.getKey() + "[Value]: " + entry.getValue());
			
			System.out.println();
			for(Integer i : map.keySet()) {
				System.out.println("[Key]: " + i + "[Value]: " + map.get(i));
			}
	}

}
