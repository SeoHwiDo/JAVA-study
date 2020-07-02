package week7;

import java.util.*;

public class Bank2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] accNum = { 12, 34, 56, 78, 90 }; // 계좌 번호를 저장하는 배열
		int[] bal = new int[accNum.length]; // 계좌 별 잔액을 저장하는 배열
		int index = -1; // 입력된 계좌가 저장되어 있는 배열 인덱스 저장

		for (int i = 0; i < bal.length; i++) {// 모든 계좌의 잔액은 5자리의 정수형 난수를 생성하여 저장하고 출력 – 본인 작성
			bal[i] = (int) (Math.random() * 89999) + 10000;
			System.out.printf("계좌번호:%1$d  잔액:%2$d\n", accNum[i], bal[i]);
		}
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 예금  |  2. 잔고출력 |  3.  종료");
			System.out.println("------------------------------------------------");
			System.out.print(" 선택 >> ");
			int choice = in.nextInt();

			if (choice == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("계좌 번호 >> ");
			int num = in.nextInt();
			for (int j = 0; j < accNum.length; j++) {
				if (accNum[j] == num) {
					index = j;
				}
			}// 입력된 계좌와 일치하는 계좌를 accNum 배열에서 검색 – 본인 작성
			if (index >= 0 && index < accNum.length) {
				switch (choice) {
				case 1:
					System.out.print("예금 : ");
					bal[index] += in.nextInt();
					index = -1;
					break;// 해당 계좌에 입금한 금액만큼 잔액을증가하고 출력 – 본인 작성;
				case 2:
					System.out.println(bal[index]);
					index = -1;
					break;// 해당 계좌의 잔고를 출력 – 본인 작성
				}
			} else
				System.out.println("해당 계좌가 존재하지 않습니다");
		}

	}
}
