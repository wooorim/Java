package chapter20;

public class Wrapper2 {

	public static void main(String[] args) {
		int num = 10; // �⺻�����δ� ���� �ִ� int�� ����
		Integer iObj = 10; // �ڽ�

		Double dObj = 3.14; // �ڽ�

		System.out.println(iObj);
		System.out.println(dObj + 10); // ������ �ּҰ� ���� �� ���� ���� ���
		System.out.println();

		int num1 = iObj.intValue(); // ��ڽ�
		double num2 = dObj.doubleValue(); // ��ڽ�

		System.out.println(num1);
		System.out.println(num2);

	}

}
