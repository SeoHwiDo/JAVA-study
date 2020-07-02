package week5;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0,value = 0;
		float hap = 0.0f, avr = 0.0f;
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요\n");
		do {
			value = input.nextInt();
			if (value != -1) {
				i++;
				hap += value;
			}
		} while (value != -1);
		{
			if (i > 0) {
				avr = hap / i;
				System.out.print("정수의 개수는" + i + "개이며 평균은" + avr + "입니다.\n프로그램 종료");
			} else if(i==0) {
				System.out.print("입력된 수가 없습니다.\n프로그램 종료");
			}
		}
	}
}
