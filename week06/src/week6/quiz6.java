package week6;

import java.util.*;

public class quiz6 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int value;
		String k = null;
		System.out.print("���� ���� Ƚ���� �Է��ϼ���(����:0)>>");
		value = key.nextInt();
		exit:for (int i = 1; i <= value; i++) {
			int rnd = (int) (Math.random() * 6) + 1;

			switch (rnd) {
			case 1:
				k = "�ϳ�";
				break;
			case 2:
				k = "��";
				break;
			case 3:
				k = "��";
				break;
			case 4:
				k = "��";
				break;
			case 5:
				k = "�ټ�";
				break;
			case 6:
				k = "����";
				break;
			}
			if (rnd != 3) {
				System.out.printf("%d>%s\t", rnd, k);
				continue;
			} else {
				break exit;
				
			}
		}System.out.printf("\n���α׷� ����");
	}
}
