package chapter20;

public class HomeWork2_15 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 =s2;
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
		if(s1 == s2)
			System.out.println("s1, s2 ���� ��� ����.");
		else
			System.out.println("s1, s2 ���� ��� �ٸ���.");
		//����:���� ��� �ٸ���
		if(s2 == s3)
			System.out.println("s2, s3 ���� ��� ����.");
		else
			System.out.println("s2, s3 ���� ��� �ٸ���.");
		//����:���� ��� ����
		if(s1.equals(s2))
			System.out.println("s1, s2 ���� ��� ����.");
		else
			System.out.println("s1, s2 ���� ��� �ٸ���.");
		//����:���� ��� ����
		if(s2.equals(s3))
			System.out.println("s2, s3 ���� ��� ����.");
		else
			System.out.println("s2, s3 ���� ��� �ٸ���.");
		//����:���� ��� ����
	}

}
