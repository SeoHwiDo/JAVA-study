package week6;

import java.util.*;

public class Bank {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int sel;
		long money = 0L;
		outter: do {
			System.out.print(
					"---------------------------------\n1. ���� | 2. ��� | 3. �ܰ���� | 4. ����\n---------------------------------\n����>>");
			sel = key.nextInt();
			switch (sel) {
			case 1:
				System.out.print("�Աݾ�:");
				money += key.nextLong();
				break;
			case 2:
				System.out.print("��ݾ�:");
				money -= key.nextLong();
				break;
			case 3:
				System.out.printf("�ܰ����:%d\n1", money);
				break;
			case 4:
				System.out.print("���α׷� ����");
				break outter;
			}
		} while (true);

	}

}
