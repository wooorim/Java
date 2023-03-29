package example2;

class Rectangle {
	private int x, y, width, height; // �簢���� �����ϴ� ���� ũ�� ����

	// boolean constaints = false;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return (width * height);
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ" + width + "x" + height + "�� �簢��");
	}

	public boolean containts(Rectangle rz) {
		// Rectangle rz�� �簢�� ������ Ÿ���� �Լ�.
		if ((this.x <= rz.x) && (this.y <= rz.y) && (this.width > rz.width) && (this.height > rz.height)) {
			return true;
			// return constaints = true;
		} else {
			return false;
			// return constaints;
		}
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������" + s.square());

		if (t.containts(r)) // t�� ã��, ������ containts�� ã�´�, �׸��� r�� ���Ѵ�.
			System.out.println("t�� r�� �����մϴ�.");// true�̸� sysout��� else�� ���� ���߱⶧����,false���� �ƹ��͵� �� ���
		if (t.containts(s))
			System.out.println("t�� s�� �����մϴ�.");

	}

}
