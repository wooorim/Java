class A {
	public A() {
		System.out.println("AŬ���� �Դϴ�.");
	}
}
class B extends A {
	public B() {
		System.out.println("BŬ���� �Դϴ�.");
	}
}
class C extends B {
	public C() {
		System.out.println("CŬ���� �Դϴ�.");
	}
}

class Computer {
	String cpu;
	String memory;
	//��ǻ�Ͱ� Cpu, Memory�� �������ִ� = has A����
}
	

public class Inheritance3 {

	public static void main(String[] args) {
		C c = new C();
		

	}

}
