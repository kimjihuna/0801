
public class ArrayDemo {
	public static void main(String[] args) {
//   	첫번째
//		int []array;
//		array = new int[4];
//		array[0] = 6;
//		array[1]= 9;
//		array[2]= 12;
//		array[3]= 15;
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.print("array["+i+"] = "+ array[i] +"\t");
//		}
//		두번째
//		double[] weights;
//		weights = new double[] { 67.3, 78.9, 52, 3 }; // 생성밎 할당
//		for (int i = 0; i < 3; i++) {
//			System.out.printf("array[%d]=%.1f\t0",i,weights[i]);
//		}

//  	세번째
		char[] grades = { 'A', 'C', 'B', 'B', 'C' };
		int i = 0;
		while (i < 5) {
			System.out.println("grades[" + i + "]=" + grades[i] + "\t");
			i++;
		}
	}
}
