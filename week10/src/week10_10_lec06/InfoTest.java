package week10_10_lec06;
import java.util.*;
public class InfoTest {
	public static void main(String[]args) {
		Scanner SignUp=new Scanner(System.in);
		Info user1=new Info();
		Info user2=new Info();
		System.out.print("���̵� �Է��ϼ���>>>");
		user1.id=SignUp.next();
		System.out.print("ù��° ��ü ���� �Ϸ�\n���̵� �Է��ϼ���>>>");
		user2.id=SignUp.next();
		System.out.print("�ι�° ��ü ���� �Ϸ�");
		System.out.println();
		System.out.println("\nù��° ��ü�� ���̵�� ��й�ȣ ���");
		user1.disPlay();
		System.out.println();
		System.out.println("�ι�° ��ü�� ���̵�� ��й�ȣ ���");
		user2.disPlay();
	}
}
