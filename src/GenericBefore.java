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
	private Object ob; // �ڽ��� ���� �� �ִ� ����(Object = ���OK)
	// ����:Object[]

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

		// ������ ��´�
		aBox.set("Apple");
		oBox.set(new Orange());

		// �ڽ����� ������ ������
		Apple ap = (Apple) aBox.get();
		Orange og = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(og);

	}

}
