package week5;

import java.util.*;

public class Test99 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char go;
		int o = 0, i = 0, anst, ansy, num1, num2;
		System.out.print("�������� �����մϴ�\n");
		do {
			i++;
			num1 = (int) (Math.random() * 9) + 1;
			num2 = (int) (Math.random() * 9) + 1;
			anst = num1 * num2;
			System.out.printf("%1$d)%2$d*%3$d=", i, num1, num2);
			ansy = input.nextInt();
			System.out.print(anst == ansy ? "�����Դϴ�\n�����Ϸ��� n�Ǵ�N�� �Է��ϼ���>>" : "�����Դϴ�\n�����Ϸ��� n�Ǵ�N�� �Է��ϼ���>>");
			go = input.next().charAt(0);
			if (anst == ansy)
				o++;
		} while (go != 'n' && go != 'N');
		{
			System.out.printf("���� Ƚ��=%d\n���α׷� ����", o);

		}
	}
}
