class Circle {
	final double PI = 3.14; // ��������.Pie3.14�� ������ �ʴ� ���� final���� ����.
	double radius; // ��������

	void setRadius(int num) { // ��������. void�� ���Ͼ����൵ ��.
		radius = num; // radius�� num���� �־��ش�. �Ű����������� �ؾ� �ȴ�.
	}

	double getArea() {
		double area = radius * radius * PI; // ���� ���� ���ϴ� ��
		return area; // ���� ���� ����� ����
	}

}

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		double area = circle.getArea(); // Ŭ������ �ٸ��� �Ȱ��� �����̸����� ���𰡴�.double area�� ���� ������ getArea�� ���� ����
		System.out.println(area); // area���� ���

	}

}
