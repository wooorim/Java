
public class Chargrade {

	public static void main(String[] args) {
	
		double avg = avg(90,80,100);
		System.out.println(avg + "�Դϴ�.");
		char grade = grade(avg);
		System.out.println(grade + "�Դϴ�.");

	}
	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math)/3.0;
	}
	public static char grade(double avg) {
		char grade = '��';
		
		if (avg >= 90)
			grade = '��';
		else if (avg >= 80)
			grade = '��';
		else if (avg >= 70)
			grade = '��';
		else if (avg >= 60)
			grade = '��';
		else 
			grade = '��';
		return grade;
	}
	

}
