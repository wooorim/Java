class Triangle {
	double width, height;

	void initTriangle(double num1, double num2) {
		width = num1;
		height = num2;
	}

	double getArea() { //����getArea�� �־��� double�Լ�
		return (width * height)/2;
	}
}

public class ObjectTest {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();// triangle��ü ���� ����
		triangle.initTriangle(10,5);
		
		System.out.println("�ﰢ�� ���̴�" + triangle.getArea());
		
		Triangle triangle2 = new Triangle();// triangle��ü ���� ����
		triangle2.initTriangle(10,1000);
		
		System.out.println("�ﰢ�� ���̴�" + triangle2.getArea());
		

	}

}
