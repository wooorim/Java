package example1;

class Friend {
	String name;
	String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriend extends Friend {
	String department;

	public CompFriend(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}
}

public class PersonInfo {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;

		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

		// 모든 동창 및 동료의 정보 전체 출력
		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
			System.out.println();
		}

	}
}
