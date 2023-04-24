package chapter23;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// �ν��Ͻ� ����
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		// ù ��° �ν��Ͻ� ����
		list.remove(0);

		// ù ��° �ν��Ͻ� ���� �� ������ �ν��Ͻ��� ����
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
