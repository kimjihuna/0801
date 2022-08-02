import java.util.Scanner;

public class ArrayDeom6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student jimin = new Student();
		System.out.print("Name : ");		jimin.name = scn.nextLine();
		System.out.print("Hakbun : ");		jimin.hakbun = scn.nextLine();
		System.out.print("Korean : ");		jimin.kor=scn.nextInt();
		System.out.print("English : ");		jimin.eng=scn.nextInt();
		System.out.print("Math : ");		jimin.mat=scn.nextInt();
		
		jimin.caleTot();
		jimin.caleAvg();
		jimin.caleGrade();
		
		jimin.display();
	}

}
