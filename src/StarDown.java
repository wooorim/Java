
public class StarDown {

	public static void main(String[] args) {
		starPrint(5);

	}
	public static void starPrint(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
