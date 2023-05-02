package chapter18;

import java.util.InputMismatchException;

public class HomeWork {

	public static void main(String[] args) {
		try {
			int num = 6 / 0;
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
