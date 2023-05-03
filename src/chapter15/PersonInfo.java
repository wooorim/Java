package chapter15;
//���� ����� ���̹Ƿ� �� ���� Ŭ������ ���ǵǾ���
//��� �����ʰ� ��ü�θ� 

class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	} 
}

class ComFriend {
	private String name;
	private String department;
	private String phone;
	
	public ComFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�μ�: " + department);
		System.out.println("��ȭ: " + phone);
	}
}
public class PersonInfo {

	public static void main(String[] args) {
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
		
		ComFriend[] cfrns = new ComFriend[5];
		int ccnt = 0;
		
		ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		ufrns[ucnt++] = new UnivFriend("SEO", "Electronic", "010-666-777");
		
		cfrns[ccnt++] = new ComFriend("YOON", "R&D 1", "02-123-999");
		cfrns[ccnt++] = new ComFriend("PARK", "R&D 2", "02-321-777");
		
		for(int i = 0; i < ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}
		
		for(int i = 0; i < ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
		
	}

}
