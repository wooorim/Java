package chapter20;
import java.lang.Number;
public class NumberClass {

	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		// Integer num1 = 29;
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());

		double d = 3.14;
		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
	}

}
