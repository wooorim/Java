
class Friend {
	protected String name;
	protected String phone;
	
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
	private String major;
	
	public UnivFriend(String name, String major, String phone) {
		super(name, phone); //�θ� Ŭ���� ������ ȣ��
		this.major = major;
	}
	@Override
	public void showInfo() {
		super.showInfo(); //�θ� Ŭ���� �Լ� ȣ��
		System.out.println("����: " + major);
	}
}
class ComFriend extends Friend{
	private String department;
	
	public ComFriend(String name, String department, String phone) {
		super(name, phone); //�θ� Ŭ���� ������ ȣ��
		this.department = department;
	}
	@Override
	public void showInfo() {
		super.showInfo(); // �θ� Ŭ���� �Լ� ȣ��
		System.out.println("�μ�: " + department);
	}
}


public class PersonInfoIherit {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		//������ ����. �θ� Ŭ����  Ÿ���� ���� ����
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new ComFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new ComFriend("PARK", "R&D 2", "02-321-777");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); //�������̵� �� �޼ҵ尡 ȣ���ȴ�.
			System.out.println();
		}
	}

}
