package chapter23;

import java.util.*;

class TestLinkedList {
	int num;
	TestLinkedList linked; // 데이터 타입이 TestLinkedList인 주소 참조
}

public class LinketListTest {

	public static void main(String[] args) {
		TestLinkedList link1 = new TestLinkedList();
		link1.num = 1;
		System.out.println(link1);

		TestLinkedList link2 = new TestLinkedList();
		link1.num = 2;
		link1.linked = link2; // LinkedList 적용
		System.out.println(link2);
	}

}
