class Grade {
	int eng, math, kor;
	
	void initGrade(int num, int num2, int num3) {
		eng = num;
		math = num2;
		kor = num3;
	}
	double getAvg() {
		return (eng + math + kor)/3.0;
	}
	
	
	char getGrade(){
		char grade = '��';
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = '��';
		}else if (avg >= 80) {
			grade = '��';
		}else if (avg >= 70) {
			grade ='��';
		}else if (avg >= 60) {
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
		
		System.out.println("�� Ȯ��" + grade.eng + grade. math + grade.kor);
		grade.initGrade(90, 70, 60);
		
		System.out.println(grade.getAvg());
		System.out.println(grade.getGrade());
	}

}
