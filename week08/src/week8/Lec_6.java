package week8;

import java.util.*;

public class Lec_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		String[] hexa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
		int k=0;
		while (true) {
			System.out.print("16진수 한개를 입력하세요\n반복문을 종료하려면 s또는S를 입력하세요:");
			String input = scan.nextLine();
			if (input.equals("s")||input.equals("S")) {
				System.out.print("프로그램 종료");
				break;
			}
			for (int i = 0; i < 16; i++) {
				if (input.equals(hexa[i])) {
					System.out.printf("16진수%1$s는 이진수로 %2$s입니다\n\n", input, hexa2bin[i]);
					break;
					}
				else {
					k++;
					
				}if(k==16)
					System.out.println("16진수가 아닙니다\n");
			}
		}
	}
}
