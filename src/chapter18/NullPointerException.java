package chapter18;

class Circle extends Object {
	double rad;

	public Circle(double rad) {
		this.rad = rad;
	}

	public double getArea() {
		return (rad * rad) * Math.PI;
	}

//	@Override
//	public String toString() {
//		return "넓이는" + getArea() + "입니다.";
//	}
}

public class NullPointerException {

	public static void main(String[] args) {

		Object obj = new Circle(10);
		System.out.println(obj);
		
		String str = null;
		System.out.println(str);
		int len = str.length();
	}

}
