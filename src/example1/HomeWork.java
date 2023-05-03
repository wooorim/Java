package example1;

import java.util.Scanner;

class Course {
	String[] name;
	int[] num;

	public Course(String[] name, int[] num) {
		this.name = name;
		this.num = num;
	}

	public void search(String s) {
		boolean judge = false;
		int score = 0;

		for (int i = 0; i < name.length; i++) {
			if (s.equals(name[i])) {
				judge = true;
				score = num[i];
			}
		}

		if (judge == false) {
			System.out.println("���� ���մϴ�.");
		} else {
			System.out.println(s + "�� ������" + score);
		}
	}
}

public class HomeWork {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);

		while (true) {
			Course cu = new Course(course, score);
			System.out.println("���� �̸� >> ");
			String name = sc.next();

			if (name.equals("�׸�")) {
				System.exit(0);
			} else {
				cu.search(name);
			}
		}
	}

}
