class Baby {
	int age; // �ν��Ͻ�(��ü) ����

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

}

public class BabyTest {

	public static void main(String[] args) {

		Baby baby = new Baby(); // ��ü ����

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
