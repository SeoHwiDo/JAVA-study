package week7;

import java.util.*;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id[] = { "linux", "unix", "window", "iOS", "android", "dos", "debian" }, scan;
		int pass[] = new int[id.length], index = -1;
		System.out.print("==== ������ ��й�ȣ ��� ====\n");
		for (int i = 0; i < pass.length; i++) {
			pass[i] = (int) (Math.random() * 899) + 100;
			System.out.printf("id=%s  \t", id[i]);
			System.out.printf("pass=%d\n", pass[i]);
		}
		System.out.println("==== id�� �Է��ϼ��� ====");
		scan = input.nextLine();
		for (int j = 0; j < id.length; j++) {
			if (scan.equals(id[j])) {
				index = j;
				break;
			}
		}if (index < id.length && index >= 0)
			System.out.printf("�Է��� id %1$s�� ��й�ȣ�� %2$d�Դϴ�\n���α׷� ����", scan, pass[index]);
	}
}
