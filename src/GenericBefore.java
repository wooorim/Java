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

class Box {
	private Object ob; // 박스에 담을 수 있는 물건(Object = 모든OK)
	// 응용:Object[]

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class GenericBefore {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		// 과일을 담는다
		aBox.set("Apple");
		oBox.set(new Orange());

		// 박스에서 과일을 꺼낸다
		Apple ap = (Apple) aBox.get();
		Orange og = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(og);

	}

}
