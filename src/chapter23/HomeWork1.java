package chapter23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		System.out.println("정수 입력: ");

		for (int i = 0;; i++) {
			int input = sc.nextInt();
			list.add(input);
			if (input == -1) {
				break;
			}
		}
		Iterator<Integer> itr = list.iterator();

	}
}