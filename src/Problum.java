
//초를 입력받아서 시와 분과 초로 변환하는 프로그램
//<입력>
//계산하실 초 : 8492
//<출력>
//8492초는 ~~ 시간 ~~~분 ~~~초 입니다.
import java.util.Scanner;

public class Problum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산하실 초를 입력 :");
		int cho = sc.nextInt();
		int min = 0;
		int hour = 0;
		int cho2 = 0;
		System.out.println(cho);
		hour = cho/3600;
		min = (cho%3600)/60;
		cho2 = (cho%3600)%60;

		System.out.printf("%d 초는 %d시간 %d분 %d초 입니다.", cho, hour, min, cho2);
	}

}
