import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.printf("%d\t", i);
				count++;
				num /= i;
				if (count == 3) {
					System.out.println();
					count = 0;
				}
			}

		}
		if (num != 1) {
			System.out.println(num);
		}
	}
}
