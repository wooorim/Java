
public class Break3 {

	public static void main(String[] args) {
		// 알파벳 중에서 10번째 j를 출력
		
		int num;
		int eng = 10;
		boolean search = false;
		char number = 0;
		
		for (num = 'A'; num >= 'Z'; num++) {
			if (num == (('A' + eng) -1)) {
				number = (char) num;
				search = true;
				break;
			}
		}
		if (search) 
			System.out.println(eng + "번째의 알파벳은" + number + "입니다.");
		else
			System.out.println("알파벳이 없습니다");
		
		}
	

}
