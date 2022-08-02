
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 배열의 초기값
		// 정수형
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] = " + array[i] + "\t");
		}
		System.out.println();
		// 실수형
		double[] arrayD = new double[4];
		for (int i = 0; i < array.length; i++) {
			System.out.print("arrayD[" + i + "] = " + arrayD[i] + "\t");
		}
		System.out.println();
		// 문자형 : 널값, '\0', '\u0000'
		char[] arrayC = new char[4];
		for (int i = 0; i < array.length; i++) {
			System.out.print("arrayC[" + i + "] = " + arrayC[i] + "\t");
		}

		// boolena 형
		System.out.println();

		boolean[] arrayB = new boolean[4];
		for (int i = 0; i < array.length; i++) {
			System.out.print("arrayB[" + i + "] = " + arrayB[i] + "\t");
		}

		// 참조형
		System.out.println();

		String[] arrayS = new String[4];
		for (int i = 0; i < array.length; i++) {
			System.out.print("arrayS[" + i + "] = " + arrayS[i] + "\t");
		}
	}

}
