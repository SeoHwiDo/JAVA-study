package week4;
import java.util.Scanner;
public class Switchcafe {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.print("�ֹ��Ϸ��� Ŀ���� ������ �Է��ϼ���>>");
		String menu =input.nextLine();
		System.out.print("������ �Է��ϼ���>>");
		int count = input.nextInt(),price=0;
		switch (menu) {
		case "����������":
			price=2000*count;
			break;
		case "�Ƹ޸�ī��":
			price=2500*count;
			break;
		case "īǪġ��":
			price=3000*count;
			break;
		case "ī���":
			price=3500*count;
			break;
		default:
			System.out.printf("�� �޴��� �����ϴ�");
		}
		if(price>0)
			System.out.printf("%s %d�� �Դϴ�",menu, price);
	}

}
