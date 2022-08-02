//수열
//12345
//23456
//34567
//45678
//56789
public class Problum2 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%d\t", num);
				num++;
			}
			num = i;
			num++;
			System.out.println();
		}
	}

}
