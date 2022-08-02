import java.util.Scanner;
public class ArrayDemo7 {
	public static void main(String[] args) {
		System.out.print("학생 몇 명? : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); 
//		sc.nextLine();
		Student[] array = new Student[count];
		
		for (Student std : array) {
			std = new Student();
			sc.nextLine();
			System.out.print("Name : ");			std.name = sc.nextLine(); 			//sc.nextLine();
			System.out.print("Hakbun : ");		std.hakbun = sc.nextLine();
			System.out.print("Korean : ");		std.kor=sc.nextInt();
			System.out.print("English : ");		std.eng=sc.nextInt();
			System.out.print("Math : ");			std.mat=sc.nextInt();
			
			std.caleTot();
			std.caleAvg();
			std.caleGrade();
			std.display();
		}
	}

}
