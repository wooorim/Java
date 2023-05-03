class Fruit {
	public void print() {
		System.out.println("나는 과일이다.");
	}
}

class Grape extends Fruit {
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit {
	public void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit {
	public void print() {
		System.out.println("나는 배이다.");
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
