class Shape extends Object{ // �θ� Ŭ����
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
	      System.out.println("�� ������: " + sum);
	   }   
	
	public static void main(String[] args) {
		
		//���� ����
		Shape[] shapeArr = { new Circle(10), new Rectangle(10, 20), new Triangle(10, 20)};
		
		//����
		double sum = 0;
		for (Shape shape : shapeArr) {
			sum += shape.getArea();
		}
		System.out.println("�� ������: " + sum);
		
		shapeAllArea(shapeArr); //�� �Լ��� ���? -> static���� �����س����� ���� �޸𸮿��ö��ֱ⶧���� ���� �ȳ��� �� �Լ��� ã�� �� �ִ�

		
//		Circle circle = new Circle(10);
//		System.out.println(circle.getArea());
//
//		Rectangle rectangle = new Rectangle(10, 20);
//		System.out.println(rectangle.getArea());
//
//		double area = circle.getArea() + rectangle.getArea();
//		System.out.println("�� ������ ��: " + area);
//
//		Shape shape = new Circle(10);
//		System.out.println(shape.getArea());
	}

}
