
//lcm gcm
import java.util.Scanner;

public class Problum5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫째수 :");
		int first = sc.nextInt();
		System.out.print("둘째수 :");
		int sec = sc.nextInt();
		int lcm, gcm = 0;

		for (int i = 2; i < first; i++) {
			if (first % i == 0 && sec % i == 0)
				gcm = i;
		}

		lcm = (first / gcm) * (sec / gcm) * gcm;
		System.out.printf("%d와 %d의 GCM = %d, LCM = %d\n", first, sec, gcm, lcm);

	}

}
