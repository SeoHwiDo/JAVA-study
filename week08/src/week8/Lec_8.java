package week8;

import java.util.*;

public class Lec_8 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean[] locker = new boolean[10];
		for (boolean i : locker)
			i = false;
		outter: while (true) {
			System.out.print("1.�뿩  2.�뿩��Ȳ  3.����>>");
			int input = key.nextInt();
			switch (input) {
			case 1:
				System.out.print("�뿩�ϰ��� �ϴ� �繰�� ��ȣ�� �Է��ϼ���>>");
				int num = key.nextInt() - 1;
				if (locker[num] == false) {
					locker[num] = true;
					System.out.print("�뿩�Ϸ�");
				} else {
					System.out.print("�뿩 �� �繰��");
				}
				break;
			case 2:
				System.out.print("---------------------�뿩 ��Ȳ ���---------------------\n");
				int j = 0;
				for (boolean i : locker)
					System.out.printf("%d)%s  ", ++j, i ? "true" : "false");
				System.out.print("\n---------------------------------------------------");
				break;
			default: // A~F �̿��� �����̸�
				System.out.print("���α׷� ����");
				break outter;
			}
			System.out.println();
		}
	}
}
