
public class For3 {

	public static void main(String[] args) {
		// 7���� �Ųٷ� �Ѹ���

		int dan = 7;
		int result;
//7���߿��� ¦���� ����ϱ�
		for (int i = 9; i >= 1; i--) {
			result = dan * i;

			if (result % 2 == 0)
				System.out.println(dan + " * " + i + " = " + result);

		}
	}

}
