package chapter20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerPractice {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자를 입력해주세요: ");

			String user = sc.nextLine();
			int count = 0;
			StringTokenizer s1 = new StringTokenizer(user);

			while (s1.hasMoreTokens()) {
				System.out.println(s1.nextToken());
				count++;
			}

			System.out.println(count + "개의 단어 입니다.");

			System.out.println("다시 하시겠습니까? (y/n)");

			String Y = sc.next();

			if (Y.equals("y")) {
				continue;
			} else if (Y.equals("n")) {
				System.out.println("프로그램 종료.");
				break;
			}

		}
		System.exit(0);
	}
}
