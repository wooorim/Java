
public class CondOp1 {

	public static void main(String[] args) {
		/*-변수 3개를 선언후 80, 33 ,55 차례대로 할당
		- 삼항연산자를 활용하여, 최대값을 출력하시오.
		*/
		
		int num1 = 80;
		int num2 = 93;
		int num3 = 100;
		
		int big;
		
		big = (num1 > num2) ? num1 : (num3 > num2) ? num3 : num2;// 
		System.out.println("최대값" + big); 

	}

}
