import java.util.Arrays;


class C {
	
}
//class C extends Object {
//	@Override //�����ڰ� �θ� �ִ� �Լ�(�Ȱ��� �̸��� �Լ�)���� üũ
//	public String toString() {
//		return "�޷�!!!!";
//	}
//}
public class Overriding {

	public static void main(String[] args) {
		C c = new C();
		C cc = null;
		System.out.println(c);//ObjectŬ������ to	String�� �⺻���
//		�� �ּҰ��� ������?
		System.out.println(cc);
		int str = 56;
		
		String str2 = new String("�ŷ�2");
		System.out.println(str2);
		System.out.println(str2.toString());//ObjectŬ������ ��ӵ� StringŬ������ �������̵��� toString ���
//		�� ��(���ڿ�)�� ������?
	}

}
