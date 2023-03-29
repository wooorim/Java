
public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
			//break문과 달리 반복문을 벗어나지 않는다.
		}
	}
	{
		//1~10까지의 짝수의 합
		//continue 구문을 써서
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {// false일때 continue문이 계속 수행. true이면 continue문을 벗어난다.
				continue;
			}
			sum += i;
		}
		System.out.println("짝수의 합은" + sum);
	}

}
