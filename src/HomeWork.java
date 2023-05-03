import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.println("과목 이름 >> ");
			boolean judge = false;
			name = sc.next();
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					judge = true;
					System.out.println(name + "점수는: " + n);
				} else if (name.equals("그만")) {
					System.exit(0);
				}

			}
			if (judge == false) {
				System.out.println("없는 과목입니다.");
			}

		}
	}
}

//그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)
//
//과목 이름 >> Jaba
//없는 과목입니다.
//과목 이름 >> Java
//Java의 점수는 95
//과목 이름 >> 안드로이드
//안드로이드의 점수는 55
//과목 이름 >> 그만
//[Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야 한다.
//
//String name;
//if(course[i].equals(name)) {
//    int n = score[i];
//    ...
//}