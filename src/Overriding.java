import java.util.Arrays;


class C {
	
}
//class C extends Object {
//	@Override //개발자가 부모에 있는 함수(똑같은 이름의 함수)인지 체크
//	public String toString() {
//		return "메롱!!!!";
//	}
//}
public class Overriding {

	public static void main(String[] args) {
		C c = new C();
		C cc = null;
		System.out.println(c);//Object클래스의 to	String의 기본기능
//		왜 주소값이 나오지?
		System.out.println(cc);
		int str = 56;
		
		String str2 = new String("매롱2");
		System.out.println(str2);
		System.out.println(str2.toString());//Object클래스가 상속된 String클래스의 오버라이딩된 toString 기능
//		왜 값(문자열)이 나오지?
	}

}
