package ListList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// �÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		Iterator<String> itr = list.iterator();
	}

}
