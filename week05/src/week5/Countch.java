package week5;
import java.util.*;
public class Countch {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		char ch;
		int b=0,s=0;
		for(int i=1;i<=10;++i) {
			System.out.printf("%d)>>",i);
			ch=input.next().charAt(0);
			if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ��� �Դϴ�");
			s++;
			}else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮�� �Դϴ�");
			b++;
			}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
			i--;
			}
		}System.out.printf("\n�ҹ��� ����=%1$d\n�빮�� ����=%2$d\n���α׷� ����",s,b);

	}
}
