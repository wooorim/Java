package ex1;

// 상수(final) + abstract 함수(바디가 없는 추상 함수)
interface Printable {
	public abstract void print(String doc);// public abstract 를 안 적어도 컴파일러가 자동으로 넣어준다
}

class Printer implements Printable { // implements = 구현한다
	@Override
	public void print(String doc) { // 함수 내용을 구현하고 있음
		System.out.println(doc);
	}
}

interface ICalculator {
	public abstract int add(int num, int num2); // 더하기

	public abstract int sub(int num, int num2); // 뺴기

	public abstract int mul(int num, int num2); // 곱하기

	int div(int num, int num2); // 나누기
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
