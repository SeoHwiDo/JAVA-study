package week4;

import java.util.*;
public class SwitchRandom {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String ch;
		int rnd1, rnd2;

		System.out.print("�����ڸ� �Է��ϼ��� >>>  ");
		ch = key.next();

		rnd1 = (int) (Math.random() * 31) + 20; // 20~50������ ���� ����
		rnd2 = (int) (Math.random() * 31) + 20; // 20~50������ ���� ����

		switch (ch) {
		case "%":    // ���� ch�� ����� ���ڰ� '%'�̸� ������ ���� ����
			System.out.println(rnd1 + " % " + rnd2 + " = " + (rnd1 % rnd2));
			break;
		case "/":    // ���� ch�� ����� ���ڰ� '/'�̸� ������ ���� ����
			System.out.println(rnd1 + " / " + rnd2 + " = " + (rnd1 / rnd2));
			break;
		case "*":   // ���� ch�� ����� ���ڰ� '*'�̸� ���� ���� ����
			System.out.println(rnd1 + " * " + rnd2 + " = " + (rnd1 * rnd2));
			break;
		default:
			System.out.println("�ش� �����ڰ� �����ϴ�");
		}
		key.close();
	}
}
