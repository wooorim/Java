class Fruit {
	public void print() {
		System.out.println("���� �����̴�.");
	}
}

class Grape extends Fruit {
	public void print() {
		System.out.println("���� �����̴�.");
	}
}

class Apple extends Fruit {
	public void print() {
		System.out.println("���� ����̴�.");
	}
}

class Pear extends Fruit {
	public void print() {
		System.out.println("���� ���̴�.");
	}
}

public class FruitTest {

	public static void main(String[] args) {
		Fruit[] fAry = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry) {
			f.print();
		}
	}

}
