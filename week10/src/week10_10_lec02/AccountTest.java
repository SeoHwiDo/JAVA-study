package week10_10_lec02;
import java.util.*;	
public class AccountTest {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		Account act=new Account("243-54-654876",10000);
		System.out.println(act.toString());
		
		System.out.print("입금액>>");
		int money=in.nextInt();
		act.deposit(money);
		System.out.println(act.toString());
		
		System.out.print("출금액>>");
		money=in.nextInt();
		boolean b=act.pay(money);
		
		System.out.println(b?act.toString():"잔액 부족");
		System.out.println("프로그램을 종료합니다");
		
	}
}
