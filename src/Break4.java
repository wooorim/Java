
public class Break4 {

	public static void main(String[] args) {
		// 1�� 1000 ������ ������ 2�� ��� ���� 3�� ����� ���� ��� ��ΰ�?

		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (((i % 2) == 0) && ((i % 3) == 0)) {
				count++;
			}
		}
		System.out.println("2�� �������� 3�� ����� ��:" + count + "��");

	}

}
