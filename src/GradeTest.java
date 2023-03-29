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
		char grade = '가';
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = '수';
		}else if (avg >= 80) {
			grade = '우';
		}else if (avg >= 70) {
			grade ='미';
		}else if (avg >= 60) {
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
		
		System.out.println("값 확인" + grade.eng + grade. math + grade.kor);
		grade.initGrade(90, 70, 60);
		
		System.out.println(grade.getAvg());
		System.out.println(grade.getGrade());
	}

}
