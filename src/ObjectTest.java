class Triangle {
	double width, height;

	void initTriangle(double num1, double num2) {
		width = num1;
		height = num2;
	}

	double getArea() { //넒이getArea를 넣어줄 double함수
		return (width * height)/2;
	}
}

public class ObjectTest {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();// triangle객체 변수 생성
		triangle.initTriangle(10,5);
		
		System.out.println("삼각형 넒이는" + triangle.getArea());
		
		Triangle triangle2 = new Triangle();// triangle객체 변수 생성
		triangle2.initTriangle(10,1000);
		
		System.out.println("삼각형 넒이는" + triangle2.getArea());
		

	}

}
