
public class Break4 {

	public static void main(String[] args) {
		// 1과 1000 사이의 숫자중 2의 배수 이자 3의 배수인 수는 모두 몇개인가?

		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (((i % 2) == 0) && ((i % 3) == 0)) {
				count++;
			}
		}
		System.out.println("2의 베수이자 3의 배수인 수:" + count + "개");

	}

}
