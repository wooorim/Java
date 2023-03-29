
public class For {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("I like Java" + i);
		}

		// 1부터 100까지의 합계
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			sum = num + sum;
		}
		System.out.println(sum);

	}

}
