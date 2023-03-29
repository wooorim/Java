
public class oneToHap2 {

	public static void main(String[] args) {
		System.out.println(ToHap(2, 10));
		oneToHap(10);
		

	}
	public static void oneToHap(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static int ToHap(int num, int num2) {
		int sum = 0;
		for (int i = num; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}
	

}
