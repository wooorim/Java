class Rectangle {
	double w;
	double h;

	void setWidth(double num) {
		w = num;
	}

	void setHeight(double num) {
		h = num;
	}

	double getArea() {
		double area = w * h;
		return area;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(10);
		rectangle.setHeight(10);

		double area = rectangle.getArea();
		System.out.println(area);

	}

}
