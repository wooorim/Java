package example1;

class Friend {
	String name;
	String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);
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
		System.out.println("����: " + major);
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
		System.out.println("�μ�: " + department);
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

		// ��� ��â �� ������ ���� ��ü ���
		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
			System.out.println();
		}

	}
}
