
public class Break3 {

	public static void main(String[] args) {
		// ���ĺ� �߿��� 10��° j�� ���
		
		int num;
		int eng = 10;
		boolean search = false;
		char number = 0;
		
		for (num = 'A'; num >= 'Z'; num++) {
			if (num == (('A' + eng) -1)) {
				number = (char) num;
				search = true;
				break;
			}
		}
		if (search) 
			System.out.println(eng + "��°�� ���ĺ���" + number + "�Դϴ�.");
		else
			System.out.println("���ĺ��� �����ϴ�");
		
		}
	

}
