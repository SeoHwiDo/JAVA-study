package week10_10_lec02;
import java.util.*;	
public class AccountTest {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		Account act=new Account("243-54-654876",10000);
		System.out.println(act.toString());
		
		System.out.print("�Աݾ�>>");
		int money=in.nextInt();
		act.deposit(money);
		System.out.println(act.toString());
		
		System.out.print("��ݾ�>>");
		money=in.nextInt();
		boolean b=act.pay(money);
		
		System.out.println(b?act.toString():"�ܾ� ����");
		System.out.println("���α׷��� �����մϴ�");
		
	}
}
