package ListList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		Iterator<String> itr = list.iterator();
	}

}
