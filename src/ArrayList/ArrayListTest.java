package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		list.remove(0);

		for (String s : list) {
			System.out.print(s + '\t');
		}
		System.out.println();
	}

}
