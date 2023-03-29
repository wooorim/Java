class Circle {
	final double PI = 3.14; // 변수선언.Pie3.14는 변하지 않는 수라서 final선언 해줌.
	double radius; // 변수선언

	void setRadius(int num) { // 변수선언. void는 리턴안해줘도 됨.
		radius = num; // radius에 num값을 넣어준다. 매개변수선언을 해야 된다.
	}

	double getArea() {
		double area = radius * radius * PI; // 원의 넒이 구하는 식
		return area; // 위에 식의 결과를 리턴
	}

}

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		double area = circle.getArea(); // 클래스가 다르면 똑같은 변수이름으로 선언가능.double area에 위의 선언한 getArea의 값을 대입
		System.out.println(area); // area값을 출력

	}

}
