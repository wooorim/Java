package example;

class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T> {
	private T ob; // 박스에 담을 수 있는 물건(Object = 모든OK)
	// 응용:Object[]

	public void set(T o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class GenericBefore2 {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox.set(new Apple());
		oBox.set(new Orange());

		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}
