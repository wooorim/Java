class INum extends Object {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	public boolean equals(Object obj) {
		if (this.num == ((INum) obj).num)
			return true;
		else
			return false;
	}
}

public class Equalrs1 {

	public static void main(String[] args) {
		String s1 = new String("아아아");
		String s2 = new String("아아아");
		
		if(s1.equals(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if (num1.equals(num2))
			System.out.println("num1, num2 내용 동일하다.");
		else
			System.out.println("num1, num2 내용 다르다");
		if (num1.equals(num3))
			System.out.println("num1, num3 내용 동일하다.");
		else
			System.out.println("num1, num3 내용 다르다");

	}

}
