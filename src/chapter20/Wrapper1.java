package chapter20;

public class Wrapper1 {

	public static void main(String[] args) {
		Integer iObj = 10; //�ڽ�
		//Integer iObj = new Integer(10);
		Double dObj = 3.14;
		//Double dObj = new Double(3.14);
		
		System.out.println(iObj);
		System.out.println(dObj); //������ �ּҰ� ���� �� ���� ���� ���
		System.out.println();
		
		int num1 = iObj;
		double num2 = dObj;
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
