
public class Count1 {

	public static void main(String[] args) {
		//1,2,3~10 짝수의 합
		//continue 구문을 써서
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {//if (i % 2 != 0) : 짝수가 아니다
				continue;
			}
			sum += i;
			
		}
		System.out.println("짝수의 합은" + sum);
	}
	
	{
		// 짝수만 출력
		
		int dan = 9;
		
		for (int i = 1; i <= 9; i++) {
			
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

	}

}
