
public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
			//break���� �޸� �ݺ����� ����� �ʴ´�.
		}
	}
	{
		//1~10������ ¦���� ��
		//continue ������ �Ἥ
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {// false�϶� continue���� ��� ����. true�̸� continue���� �����.
				continue;
			}
			sum += i;
		}
		System.out.println("¦���� ����" + sum);
	}

}
