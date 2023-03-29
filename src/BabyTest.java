class Baby {
	int age; // 인스턴스(객체) 변수

	void setAge(int num) {
		age = num;
	}

	int getAge() {
		return age;
	}

	void showAdult() {
		if (age >= 20) {
			System.out.println("술을 마실수 있습니다.");
		} else {
			System.out.println("술을 마실수 없습니다.");
		}
	}

}

public class BabyTest {

	public static void main(String[] args) {

		Baby baby = new Baby(); // 객체 생성

		System.out.println(baby.age);
		// 값을 주지 않으면 0으로 초기화 된다.

		baby.age = 10;
		System.out.println(baby.age);

		baby.setAge(20);
		System.out.println(baby.age);
		System.out.println(baby.getAge());
		System.out.println(baby); // Baby@4926097b Baby객체의 주소

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
