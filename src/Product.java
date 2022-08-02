
public class Product {
	String name; // member variable, instance variable
	int price;
	String color;

	void display() { // member method
		System.out.printf("이름 = %s, 가격 = %d, 색상 = %s\n", name, price, color);
	}
}
//member variable,method는 반드시 주소로 접근한다.
//주소는 new할 때 생긴다.ㄴ
