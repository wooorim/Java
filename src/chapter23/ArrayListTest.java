package chapter23;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// 인스턴스 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		// 첫 번째 인스턴스 삭제
		list.remove(0);

		// 첫 번째 인스턴스 삭테 후 나머지 인스턴스를 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		for (String s : list) {
			System.out.print(s + '\t');
		}
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next() + '\t');
		}
		System.out.println();
	}

}
