
public class CondOp1 {

	public static void main(String[] args) {
		/*-���� 3���� ������ 80, 33 ,55 ���ʴ�� �Ҵ�
		- ���׿����ڸ� Ȱ���Ͽ�, �ִ밪�� ����Ͻÿ�.
		*/
		
		int num1 = 80;
		int num2 = 93;
		int num3 = 100;
		
		int big;
		
		big = (num1 > num2) ? num1 : (num3 > num2) ? num3 : num2;// 
		System.out.println("�ִ밪" + big); 

	}

}
