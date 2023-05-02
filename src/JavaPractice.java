import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {
	@Override
	int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	@Override
	int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	@Override
	int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	@Override
	int calculate() {
		return a / b;
	}
}

public class JavaPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		Calc cal;
		switch (c) {
		case '+':
			cal = new Add();
			break;
		case '-':
			cal = new Sub();
			break;
		case '*':
			cal = new Mul();
			break;
		case '/':
			cal = new Div();
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
			sc.close();
			return;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		System.out.println(result);
		sc.close();

	}
}
