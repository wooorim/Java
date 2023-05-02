package ex1;

// ���(final) + abstract �Լ�(�ٵ� ���� �߻� �Լ�)
interface Printable {
	public abstract void print(String doc);// public abstract �� �� ��� �����Ϸ��� �ڵ����� �־��ش�
}

class Printer implements Printable { // implements = �����Ѵ�
	@Override
	public void print(String doc) { // �Լ� ������ �����ϰ� ����
		System.out.println(doc);
	}
}

interface ICalculator {
	public abstract int add(int num, int num2); // ���ϱ�

	public abstract int sub(int num, int num2); // ����

	public abstract int mul(int num, int num2); // ���ϱ�

	int div(int num, int num2); // ������
}

class MyCalculator implements ICalculator {
	public int add(int num, int num2) {
		return num + num2;
	}

	public int sub(int num, int num2) {
		return num - num2;
	}

	public int mul(int num, int num2) {
		return num * num2;
	}

	public int div(int num, int num2) {
		return num / num2;
	}
}

public class Interface {

	public static void main(String[] args) {
		ICalculator calculator = new MyCalculator();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.sub(10, 20));
		System.out.println(calculator.mul(10, 20));
		System.out.println(calculator.div(10, 20));

		Printable prn = new Printer();
		prn.print("Hello Java");
	}

}
