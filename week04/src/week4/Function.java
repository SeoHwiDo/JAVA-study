package week4;
import java.util.Scanner;
public class Function {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("x�� ���� �Է��ϼ���:");
		int x=input.nextInt(),f;
		if(x<=0) {
			f=(x*x*x)-9*x+2;
			System.out.printf("�Լ��� ����%d�Դϴ�.",f);
		}else if(x>0){
			f=7*x+2;
			System.out.printf("�Լ��� ����%d�Դϴ�.", f);
		}
	}
	
}
