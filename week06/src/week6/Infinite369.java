package week6;

import java.util.*;

public class Infinite369 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		char ex;
		do {
			System.out.print("369������ �����մϴ�");
			int h1, h2, t1, t2, i = 0, rnd = (int) (Math.random() * 900) + 100;
			System.out.printf("\n������ ����>>>>%d", rnd);
			h1 = rnd / 100;
			h2 = rnd % 100;
			t1 = h2 / 10;
			t2 = h2 % 10;
			if (h1 % 3 == 0)
				i++;
			if (t1!=0&&t1 % 3 == 0)
				i++;
			if (t2!=0&&t2 % 3 == 0)
				i++;
			System.out.print("�ڼ�");
			if (i == 0||h2==0) {
				System.out.print(" ����");
			}else{
				for (int j = 0; i > j; j++) {
					System.out.print("¦");
				}
			}
			System.out.print("\n���� �Ϸ��� f�Ǵ� F�� �Է��ϼ���>>");
			ex = key.next().charAt(0);
			if (ex != 'f' && ex != 'F')
				continue;
			else
				break;
			}while (true);
		System.out.print("���α׷��� �����մϴ�");
		}
	}

