package chapter20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerPractice {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���ڸ� �Է����ּ���: ");

			String user = sc.nextLine();
			int count = 0;
			StringTokenizer s1 = new StringTokenizer(user);

			while (s1.hasMoreTokens()) {
				System.out.println(s1.nextToken());
				count++;
			}

			System.out.println(count + "���� �ܾ� �Դϴ�.");

			System.out.println("�ٽ� �Ͻðڽ��ϱ�? (y/n)");

			String Y = sc.next();

			if (Y.equals("y")) {
				continue;
			} else if (Y.equals("n")) {
				System.out.println("���α׷� ����.");
				break;
			}

		}
		System.exit(0);
	}
}
