
public class ForInFor {

	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {

			for (int j = 9; j >= 1; j--) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}

		{

			for (int i = 0; i < 3; i++) { // 바깥쪽 for문
				System.out.println("-----------------");
				for (int j = 0; j < 3; j++) { // 안쪽 for문
					System.out.print("[" + i + "," + j + "]");
				}
				System.out.print('\n');
			}

		}

	}
}
