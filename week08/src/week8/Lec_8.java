package week8;

import java.util.*;

public class Lec_8 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean[] locker = new boolean[10];
		for (boolean i : locker)
			i = false;
		outter: while (true) {
			System.out.print("1.대여  2.대여현황  3.종료>>");
			int input = key.nextInt();
			switch (input) {
			case 1:
				System.out.print("대여하고자 하는 사물함 번호를 입력하세요>>");
				int num = key.nextInt() - 1;
				if (locker[num] == false) {
					locker[num] = true;
					System.out.print("대여완료");
				} else {
					System.out.print("대여 된 사물함");
				}
				break;
			case 2:
				System.out.print("---------------------대여 현황 출력---------------------\n");
				int j = 0;
				for (boolean i : locker)
					System.out.printf("%d)%s  ", ++j, i ? "true" : "false");
				System.out.print("\n---------------------------------------------------");
				break;
			default: // A~F 이외의 문자이면
				System.out.print("프로그램 종료");
				break outter;
			}
			System.out.println();
		}
	}
}
