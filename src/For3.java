
public class For3 {

	public static void main(String[] args) {
		// 7단을 거꾸로 뿌리기

		int dan = 7;
		int result;
//7단중에서 짝수만 출력하기
		for (int i = 9; i >= 1; i--) {
			result = dan * i;

			if (result % 2 == 0)
				System.out.println(dan + " * " + i + " = " + result);

		}
	}

}
