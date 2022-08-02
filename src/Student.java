
public class Student {
	String name, hakbun;
	int kor, eng, mat, tot;
	double avg;
	char grade;

	void caleTot() {
		tot = kor + eng + mat;
	}

	void caleAvg() {
		avg = tot / 3;
	}

	void caleGrade() {
		grade = (avg <= 100 && avg >= 90) ? 'A' : (avg <= 90) ? 'B' : (avg <= 80) ? 'C' : (avg <= 60) ? 'D' : 'F';
	}

	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name, hakbun, kor, eng, mat, tot, avg, grade);
	}

}
