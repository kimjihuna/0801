
//자판기 프로그램
//입력 : 145678
//50,000원권 : 2개
//10,000원권 : 4개
//5000원권 , 1000,500,100,50,10,1~~~
import java.util.Scanner;

public class Problum3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int money = sc.nextInt();

		int[] array = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		System.out.println(array.length); // 배열 크기 확인
//		int[] rjtmfmaehs = new int[9];
		int mok, na = 0;
		for (int i = 0; i < array.length; i++) {
			mok = money / array[i];
			na = money % array[i];
			System.out.println(array[i] + "원권:" + mok);
			money = na;
		}

//		rjtmfmaehs[0] = money/50000;
//		rjtmfmaehs[1] = (money%50000)/10000;
//		rjtmfmaehs[2] = ((money%50000)%10000)/5000;
//		rjtmfmaehs[3] = (((money%50000)%10000)%5000)/1000;
//		rjtmfmaehs[4] = ((((money%50000)%10000)%5000)%1000)/500;
//		rjtmfmaehs[5] = (((((money%50000)%10000)%5000)%1000)%500)/100;
//		rjtmfmaehs[6] = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50;
//		rjtmfmaehs[7] = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10;
//		rjtmfmaehs[8] = ((((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10)/1;
//		
//		System.out.printf("50,000원권 : %d\n", rjtmfmaehs[0]);
//		System.out.printf("10,000원권 : %d\n", rjtmfmaehs[1]);
//		System.out.printf("5,000원권 : %d\n", rjtmfmaehs[2]);
//		System.out.printf("1,000원권 : %d\n", rjtmfmaehs[3]);
//		System.out.printf("500원권 : %d\n", rjtmfmaehs[4]);
//		System.out.printf("100원권 : %d\n", rjtmfmaehs[5]);
//		System.out.printf("50원권 : %d\n", rjtmfmaehs[6]);
//		System.out.printf("10원권 : %d\n", rjtmfmaehs[7]);
//		System.out.printf("1원권 : %d\n", rjtmfmaehs[8]);
//		

	}

}
