import java.util.Scanner;
public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 몇 개? : ");
		int count = sc.nextInt();
		sc.nextLine();
		Product[] array = new Product[count];
		
		for (Product product : array) {
			product = new Product();
			System.out.print("name : "); product.name = sc.nextLine();
			System.out.print("price : "); product.price = sc.nextInt();
			sc.nextLine();
			System.out.print("color : "); product.color = sc.nextLine();
			
			product.display();
		}
		
		
	}

}
