class Grade{
	int kor,eng,math; //전역변수
	
	void iniGrade(int num, int num2, int num3) {
		kor = num; //지역변수
		eng = num2;
		math = num3;
	}
	double getAvg() {
		return (kor + eng + math)/3.0;
	}
	char getGrade() {
		char grade = '가';
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = '수';
		}else if (avg >= 80) {
			grade = '우';
		}else if(avg >= 70) {
			grade = '미';
		}else if(avg >= 60) {
			grade = '양';
		}else {
			grade = '가';
		}
		return grade;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Grade grade = new Grade();
		
		System.out.println("값확인" + grade.kor + grade.eng + grade.math);
		
		grade.iniGrade(70, 80, 90);
		System.out.println(grade.getAvg());
		System.out.println(grade.getGrade());
		
	}

}
