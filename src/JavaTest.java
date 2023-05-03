
class C extends Object{
	//모든 클래스는 Object클래스가 상속된다.
	//Object클래스 안에 이ㅆ는 변수 함수를 호출해서 쓸 수 있다
	//함수 오버라이딩도 적용해서 호출 가능
}
public class JavaTest {

	public static void main(String[] args) {
	
		C c =new C();
		System.out.println(c);
	}

}
