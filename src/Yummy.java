class Cake {
	public void yummy() { //
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake"); // Cake의 yummy를 오버라이딩
	}

	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class Yummy {

	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();

		c1.yummy();
		c2.tasty();

	}

}
