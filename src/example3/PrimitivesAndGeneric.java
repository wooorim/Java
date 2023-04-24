package example3;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class PrimitivesAndGeneric {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(125); // ���� �ڽ� ����
		int num = iBox.get(); // ���� ��ڽ� ����
		System.out.println(num);
	}

}
