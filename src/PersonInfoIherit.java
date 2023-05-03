
class Friend {
	protected String name;
	protected String phone;
	
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
	private String major;
	
	public UnivFriend(String name, String major, String phone) {
		super(name, phone); //부모 클래스 생성자 호출
		this.major = major;
	}
	@Override
	public void showInfo() {
		super.showInfo(); //부모 클래스 함수 호출
		System.out.println("전공: " + major);
	}
}
class ComFriend extends Friend{
	private String department;
	
	public ComFriend(String name, String department, String phone) {
		super(name, phone); //부모 클래스 생성자 호출
		this.department = department;
	}
	@Override
	public void showInfo() {
		super.showInfo(); // 부모 클래스 함수 호출
		System.out.println("부서: " + department);
	}
}


public class PersonInfoIherit {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		//다형성 적용. 부모 클래스  타입의 참조 변수
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new ComFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new ComFriend("PARK", "R&D 2", "02-321-777");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); //오버라이딩 한 메소드가 호툴된다.
			System.out.println();
		}
	}

}
