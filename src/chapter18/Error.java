package chapter18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			System.out.println("a/b...a? ");
			int n1 = kb.nextInt();

			System.out.println("a/b...b? ");
			int n2 = kb.nextInt();

			System.out.printf("%d / %d = %d \n ", n1, n2, n1 / n2);
			System.out.println("�쿡��");

		} catch (ArithmeticException e) {
			System.out.println("�޷�");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {// ���� �����̵� ������ ���� ������ ����Ǿ���ϴ� ���� finally�� ���� ����
			System.out.println("���̳θ� ����");
		}
		System.out.println("Good Bye~~~!");
}

}
