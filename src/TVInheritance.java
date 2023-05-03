class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProrerty() {
		System.out.println(super.getSize() + "��ġ" + this.color + "�÷�");
	}
}

public class TVInheritance {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);

		myTV.printProrerty();
	}

}
