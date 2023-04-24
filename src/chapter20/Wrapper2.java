package chapter20;

public class Wrapper2 {

	public static void main(String[] args) {
		int num = 10; // 기본적으로는 값만 넣는 int로 선언
		Integer iObj = 10; // 박싱

		Double dObj = 3.14; // 박싱

		System.out.println(iObj);
		System.out.println(dObj + 10); // 원래는 주소값 참조 이 경우는 내용 출력
		System.out.println();

		int num1 = iObj.intValue(); // 언박싱
		double num2 = dObj.doubleValue(); // 언박싱

		System.out.println(num1);
		System.out.println(num2);

	}

}
