
public class ArrayDemo9 {
	public static void main(String[] args) {
//		double[] original = {78.2,56.9,43.5};
//		double[] target = {172.8,185.4,162.9,152.1};
//		
//		target[0] = original[1];

//		int original = 5;
//		int target = 9;
//		System.out.printf("original = %d, traget = %d\n", original, target);

//		Product pencil = new Product();
//		pencil.name = "연필";
//		pencil.price = 200;
//		pencil.color = "black";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스";
//		mouse.price = 300;
//		mouse.color = "pink";
//		
//		pencil.display();
//		mouse.display();
//		
//		
//		Product temp = pencil;
//		pencil = mouse;
//		mouse = temp;
//		
//		pencil.display();
//		mouse.display();

		// bubblesorting
		int[] original = { 4, 6, 2, 3, 5, 9, 7, 6, 1, 2, 4, 8 };
		System.out.println("Before Sorting");
		for (int su : original) {
			System.out.printf("%d\t", su);
		}

		for (int i = 0; i < original.length - 1; i++) {
			for (int j = 0; j < original.length - 1; j++) {
				if(original[j] > original[j+1]) {
					int temp = original[j];
					original[j] = original[j+1];
					original[j+1] = temp;
				}
			}
		}
		System.out.println();
		for (int su : original) {
			System.out.printf("%d\t", su);
		}

	}

}
