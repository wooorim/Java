import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.println("���� �̸� >> ");
			boolean judge = false;
			name = sc.next();
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					judge = true;
					System.out.println(name + "������: " + n);
				} else if (name.equals("�׸�")) {
					System.exit(0);
				}

			}
			if (judge == false) {
				System.out.println("���� �����Դϴ�.");
			}

		}
	}
}

//�׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�. "�׸�"�� �Է¹����� �����Ѵ�. (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)
//
//���� �̸� >> Jaba
//���� �����Դϴ�.
//���� �̸� >> Java
//Java�� ������ 95
//���� �̸� >> �ȵ���̵�
//�ȵ���̵��� ������ 55
//���� �̸� >> �׸�
//[Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ� �Ѵ�.
//
//String name;
//if(course[i].equals(name)) {
//    int n = score[i];
//    ...
//}