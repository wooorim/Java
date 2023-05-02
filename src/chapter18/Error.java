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
			System.out.println("우에에");

		} catch (ArithmeticException e) {
			System.out.println("메롱");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {// 정상 실행이든 에러가 나든 무조건 실행되어야하는 것은 finally에 집어 넣음
			System.out.println("파이널리 실행");
		}
		System.out.println("Good Bye~~~!");
}

}
