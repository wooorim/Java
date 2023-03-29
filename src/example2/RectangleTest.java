package example2;

class Rectangle {
	private int x, y, width, height; // 사각형을 구성하는 점과 크기 정보

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
		System.out.println("(" + x + "," + y + ")" + "에서 크기가" + width + "x" + height + "인 사각형");
	}

	public boolean containts(Rectangle rz) {
		// Rectangle rz는 사각형 데이터 타입의 함수.
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
		System.out.println("s의 면적은" + s.square());

		if (t.containts(r)) // t를 찾고, 다음에 containts를 찾는다, 그리고 r과 비교한다.
			System.out.println("t는 r을 포함합니다.");// true이면 sysout출력 else를 선언 안했기때문에,false때는 아무것도 안 출력
		if (t.containts(s))
			System.out.println("t는 s를 포함합니다.");

	}

}
