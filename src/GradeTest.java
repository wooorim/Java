class Grade{
	int kor,eng,math; //��������
	
	void iniGrade(int num, int num2, int num3) {
		kor = num; //��������
		eng = num2;
		math = num3;
	}
	double getAvg() {
		return (kor + eng + math)/3.0;
	}
	char getGrade() {
		char grade = '��';
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = '��';
		}else if (avg >= 80) {
			grade = '��';
		}else if(avg >= 70) {
			grade = '��';
		}else if(avg >= 60) {
			grade = '��';
		}else {
			grade = '��';
		}
		return grade;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Grade grade = new Grade();
		
		System.out.println("��Ȯ��" + grade.kor + grade.eng + grade.math);
		
		grade.iniGrade(70, 80, 90);
		System.out.println(grade.getAvg());
		System.out.println(grade.getGrade());
		
	}

}
