package chapter20;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random rd = new Random(10); //10Àº seed°ª

		for (int i = 0; i < 7; i++) {
			System.out.println(rd.nextInt(1000) + 1);
		}
	}

}
