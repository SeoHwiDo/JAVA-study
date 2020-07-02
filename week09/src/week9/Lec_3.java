package week9;

import java.util.*;

public class Lec_3 {
	public static int digit_input(String prompt) {
		Scanner key = new Scanner(System.in);
		System.out.print(prompt);
		return key.nextInt();
	}

	public static void main(String[] args) {
		int year = digit_input("태어난 연도를 입력하세요>>");
		int month = digit_input("몇 월 생 입니까>>");
		System.out.printf("%1$d년%2$d월 생 입니다.", year, month);
	}
}
