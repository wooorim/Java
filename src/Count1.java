
public class Count1 {

	public static void main(String[] args) {
		//1,2,3~10 ¦���� ��
		//continue ������ �Ἥ
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {//if (i % 2 != 0) : ¦���� �ƴϴ�
				continue;
			}
			sum += i;
			
		}
		System.out.println("¦���� ����" + sum);
	}
	
	{
		// ¦���� ���
		
		int dan = 9;
		
		for (int i = 1; i <= 9; i++) {
			
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

	}

}
