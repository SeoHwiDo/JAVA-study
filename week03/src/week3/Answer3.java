package week3;
import java.util.Scanner;
public class Answer3 {
	public static void main(String[]args) {
		System.out.print("�������� ������ �Է��Ͻÿ�:");
		Scanner input= new Scanner(System.in);
		int orange=input.nextInt();
		int box;
		int other;
		box=orange/10;
		other=orange%10;
		System.out.printf("%1$d�ڽ��� �ʿ��ϰ� %2$d���� �����ϴ�.",box,other);
	}
}
