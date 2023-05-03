class Shape extends Object{ // 부모 클래스
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle extends Shape {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape {
	private double width, height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return (width * height) / 2.0; 
	}
}


public class ShapeHap {
	
	static void shapeAllArea(Shape[] sh) {
	      double sum = 0;
	      for (Shape shape : sh) {
	         sum += shape.getArea();
	      }
	      System.out.println("총 면적은: " + sum);
	   }   
	
	public static void main(String[] args) {
		
		//변수 선언
		Shape[] shapeArr = { new Circle(10), new Rectangle(10, 20), new Triangle(10, 20)};
		
		//로직
		double sum = 0;
		for (Shape shape : shapeArr) {
			sum += shape.getArea();
		}
		System.out.println("총 면적은: " + sum);
		
		shapeAllArea(shapeArr); //이 함수는 어디? -> static으로 선언해놓으면 먼저 메모리에올라가있기때문에 오류 안나고 이 함수를 찾을 수 있다

		
//		Circle circle = new Circle(10);
//		System.out.println(circle.getArea());
//
//		Rectangle rectangle = new Rectangle(10, 20);
//		System.out.println(rectangle.getArea());
//
//		double area = circle.getArea() + rectangle.getArea();
//		System.out.println("총 면적의 합: " + area);
//
//		Shape shape = new Circle(10);
//		System.out.println(shape.getArea());
	}

}
