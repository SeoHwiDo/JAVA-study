package week9;

import java.util.*;

public class Lec_3 {
	public static int digit_input(String prompt) {
		Scanner key = new Scanner(System.in);
		System.out.print(prompt);
		return key.nextInt();
	}

	public static void main(String[] args) {
		int year = digit_input("�¾ ������ �Է��ϼ���>>");
		int month = digit_input("�� �� �� �Դϱ�>>");
		System.out.printf("%1$d��%2$d�� �� �Դϴ�.", year, month);
	}
}
