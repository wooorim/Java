
public class Break1 {

	public static void main(String[] args) {

		boolean search = false;
		int num = 0;
		
		for (int i = 1; i < 100; i++) {

			if ((i % 7 == 0) && (i % 8 == 0)) {
				num = i;
				search = true;
				break;
			}

		}
		
		if (search) {
			System.out.println(num);
		} else {
			System.out.println("¾ø´Ù");
		}

	}
}
