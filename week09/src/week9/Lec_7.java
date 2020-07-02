package week9;
import java.util.*;
public class Lec_7 {
	//아래의 메소드 선언은 본인 작성
	public static String menuAt(int rernd) {
		String[] menulist= {"카푸치노","에스프레소","아메리카노","카페라떼","자몽에이드"};
		String pick = null;
		for(int i=0;i<menulist.length;i++) {
			if(i==rernd-1)
				pick=menulist[i];// menuAt() 메소드 선언 - 생성된 난수를 매개변수로 받아 메뉴를 반환하는 메소드
		}return pick;
	}
	public static int valueAt(int rernd) {
		int[] menuvalue= {3000,2000,2500,3500,4000};
		int pick = 0;
		for(int i=0;i<menuvalue.length;i++) {
			if(i==rernd-1)
				pick=menuvalue[i];// menuAt() 메소드 선언 - 생성된 난수를 매개변수로 받아 메뉴를 반환하는 메소드
		}return pick;// valueAt() 메소드 선언 - 생성된 난수를 매개변수로 받아 가격을 반환하는 메소드
	}
	public static int input(String guide) {
		System.out.print(guide);
		Scanner key=new Scanner(System.in);
		int p=key.nextInt();
		return p;// input() 메소드 선언 -프롬프트 문자열을 매개변수로 받으며 메소드에서 입력 받은 정수를 반환하는 메소드
	}

	public static void main(String[] args) {
		int total = 0;
		int count = input("인원수를 입력하세요 >> "); // input() 호출
		for (int i = 0; i < count; i++) {
			int rnd = (int) (Math.random() * 5) + 1;
			int value = valueAt(rnd); // valueAt() 메소드 호출, 가격을 반환받는다
			String menu = menuAt(rnd); // menuAt() 메소드 호출, 메뉴를 반환받는디
			System.out.println("난수 : " + rnd + ", 메뉴 : " + menu + ", 가격 : " + value);
			total += value;
		}

		int money = input("주문합계 : " + total + "  >> "); // input() 호출, 사용자로부터 받은 돈을 반환
		System.out.println("받은 돈 : " + money);
		System.out.println(money - total != 0 ? "거스름 돈 : " + (money - total) : "거스름 돈 없음");
	}
}

