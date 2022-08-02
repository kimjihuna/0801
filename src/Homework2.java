
public class Homework2 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			// 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
			if (count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
		}

	}
}
