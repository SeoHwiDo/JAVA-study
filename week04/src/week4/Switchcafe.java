package week4;
import java.util.Scanner;
public class Switchcafe {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.print("주문하려는 커피의 종류를 입력하세요>>");
		String menu =input.nextLine();
		System.out.print("수량을 입력하세요>>");
		int count = input.nextInt(),price=0;
		switch (menu) {
		case "에스프레소":
			price=2000*count;
			break;
		case "아메리카노":
			price=2500*count;
			break;
		case "카푸치노":
			price=3000*count;
			break;
		case "카페라떼":
			price=3500*count;
			break;
		default:
			System.out.printf("그 메뉴는 없습니다");
		}
		if(price>0)
			System.out.printf("%s %d원 입니다",menu, price);
	}

}
