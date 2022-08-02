
public class Problum4 {
	public static void main(String[] args) {
		int[] array = { 10, 50, 44, 56, 29, 30, 9, 48, 84, 92 };
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 0;

		System.out.print("배열원본 = ");
		for (int i : array) {
			;
			System.out.printf("%d\t", i);
		}

		System.out.println();

		System.out.print("합계 = ");
		for (int i : array) {
			sum += i;
		}

		System.out.printf("%d", sum);

		System.out.println();
		System.out.printf("평균 = %.1f", (double) sum / array.length);

		System.out.println();

		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		System.out.printf("최대값 = %d", max);
		System.out.println();
		for (int i : array) {
			if (min == 0) {
				min = i;
			} else if (min > i) {
				min = i;
			}
		}
		System.out.printf("최소값 = %d", min);
		System.out.println();


		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] >= array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("오름차순 : ");
		for (int i : array) {
			System.out.printf("%d\t", i);
		}
		
		System.out.println();

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] <= array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("내림차순 : ");
		for (int i : array) {
			System.out.printf("%d\t", i);
		}
		
		

	}
}
