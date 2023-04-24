package chapter20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerClass {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			count = 0; // �Ź� 0���� �ʱ�ȭ
			System.out.println("���ڸ� �Է��ϼ���: ");

			try {
				String words = scanner.nextLine();

				if (words.trim().toUpperCase().equals("EXIT")) // toUpperCase() ��� ���ڸ� �빮�ڷ� �ٲ㼭 ��ǻ�Ͱ� �ν�
					// trim() ������ �ڸ���.���� ����Ѵ�.
					break;

				StringTokenizer tokens = new StringTokenizer(words, " ");

				while (tokens.hasMoreTokens()) {
					count++;
					System.out.println(tokens.nextToken());
				}
				System.out.println("�ܾ� ������: " + count);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("�߸��� �Է��Դϴ�. ���α׷��� ó������ ���� �մϴ�.");
				continue;
			}

		}
		System.out.println("�����մϴ�.");

	}
}
