package week6;

import java.util.*;

public class quiz6 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int value;
		String k = null;
		System.out.print("난수 생성 횟수를 입력하세요(종료:0)>>");
		value = key.nextInt();
		exit:for (int i = 1; i <= value; i++) {
			int rnd = (int) (Math.random() * 6) + 1;

			switch (rnd) {
			case 1:
				k = "하나";
				break;
			case 2:
				k = "둘";
				break;
			case 3:
				k = "셋";
				break;
			case 4:
				k = "넷";
				break;
			case 5:
				k = "다섯";
				break;
			case 6:
				k = "여섯";
				break;
			}
			if (rnd != 3) {
				System.out.printf("%d>%s\t", rnd, k);
				continue;
			} else {
				break exit;
				
			}
		}System.out.printf("\n프로그램 종료");
	}
}
