class parentAdder {
	public int add(int a, int b) {
		return a+b;
	}
}

class ChildAdder extends parentAdder {
	
	public double add(double a, double b) {
		System.out.println("������ �����մϴ�.");
		return a+b;
	}
}
public class JavaTest {

	public static void main(String[] args) {
		
	}

}
