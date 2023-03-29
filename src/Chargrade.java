
public class Chargrade {

	public static void main(String[] args) {
	
		double avg = avg(90,80,100);
		System.out.println(avg + "입니다.");
		char grade = grade(avg);
		System.out.println(grade + "입니다.");

	}
	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math)/3.0;
	}
	public static char grade(double avg) {
		char grade = '가';
		
		if (avg >= 90)
			grade = '수';
		else if (avg >= 80)
			grade = '우';
		else if (avg >= 70)
			grade = '미';
		else if (avg >= 60)
			grade = '양';
		else 
			grade = '가';
		return grade;
	}
	

}
