class A {
	public A() {
		System.out.println("A클래스 입니다.");
	}
}
class B extends A {
	public B() {
		System.out.println("B클래스 입니다.");
	}
}
class C extends B {
	public C() {
		System.out.println("C클래스 입니다.");
	}
}

class Computer {
	String cpu;
	String memory;
	//컴퓨터가 Cpu, Memory를 가지고있다 = has A관계
}
	

public class Inheritance3 {

	public static void main(String[] args) {
		C c = new C();
		

	}

}
