package chapter23;

import java.util.*;

class TestLinkedList {
	int num;
	TestLinkedList linked; // ������ Ÿ���� TestLinkedList�� �ּ� ����
}

public class LinketListTest {

	public static void main(String[] args) {
		TestLinkedList link1 = new TestLinkedList();
		link1.num = 1;
		System.out.println(link1);

		TestLinkedList link2 = new TestLinkedList();
		link1.num = 2;
		link1.linked = link2; // LinkedList ����
		System.out.println(link2);
	}

}
