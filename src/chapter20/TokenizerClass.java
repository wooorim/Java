package chapter20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerClass {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			count = 0; // 매번 0으로 초기화
			System.out.println("문자를 입력하세요: ");

			try {
				String words = scanner.nextLine();

				if (words.trim().toUpperCase().equals("EXIT")) // toUpperCase() 모든 문자를 대문자로 바꿔서 컴퓨터가 인식
					// trim() 공백을 자르다.많이 사용한다.
					break;

				StringTokenizer tokens = new StringTokenizer(words, " ");

				while (tokens.hasMoreTokens()) {
					count++;
					System.out.println(tokens.nextToken());
				}
				System.out.println("단어 갯수는: " + count);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("잘못된 입력입니다. 프로그램을 처음부터 시작 합니다.");
				continue;
			}

		}
		System.out.println("종료합니다.");

	}
}
