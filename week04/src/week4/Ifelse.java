package week4;
import java.util.Scanner;
public class Ifelse {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int x,y;
		System.out.print("�Ѱ��� ������ �Է��Ͻÿ�:");
		x=input.nextInt();
		y=x%4;
		if(y==0) 
			System.out.printf("�Է�����%d--->4�� ���",x);
		else
			System.out.printf("�Է�����%d--->4�� ����� �ƴմϴ�.",x);
	}
}
