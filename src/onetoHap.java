
public class onetoHap {

	public static void main(String[] args) {
		System.out.println(oneToHap(1, 100));
		

	}
	public static int oneToHap(int num, int num2) {
		int sum = 0;
		for (int i = num; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

}
