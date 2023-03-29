class Baby {
	int age; // �ν��Ͻ�(��ü) ����
	String name;

	void setAge(int num) {
		age = num;
	}

	int getAge() {
		return age;
	}

	void showAdult() {
		if (age >= 20) {
			System.out.println("���� ���Ǽ� �ֽ��ϴ�.");
		} else {
			System.out.println("���� ���Ǽ� �����ϴ�.");
		}
	}

	void initBaby(int num, String show) {
		age = num;
		name = show;
	}

	void show() {
		System.out.println(age + "�� " + "�̸��� " + name + "�Դϴ�.");
	}

}

public class BabyTest2 {

	public static void main(String[] args) {

		Baby baby = new Baby(); // ��ü ����

		baby.initBaby(5, "��ī¯");
		baby.show(); // 5�� �̸� ��ī¯ �Դϴ�.

		System.out.println(baby.age);
		// ���� ���� ������ 0���� �ʱ�ȭ �ȴ�.

		baby.age = 10;
		System.out.println(baby.age);

		baby.setAge(20);
		System.out.println(baby.age);
		System.out.println(baby.getAge());
		System.out.println(baby); // Baby@4926097b Baby��ü�� �ּ�

		Baby baby2 = new Baby();

		baby2.setAge(10);
		System.out.println(baby2.getAge());

		System.out.println(baby2);

		baby2.showAdult();//
		baby2.setAge(20);
		baby2.showAdult();

		baby2.showAdult();
	}

}
