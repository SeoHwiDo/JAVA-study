package week6;

import java.util.*;

public class Bank {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int sel;
		long money = 0L;
		outter: do {
			System.out.print(
					"---------------------------------\n1. 예금 | 2. 출금 | 3. 잔고출력 | 4. 종료\n---------------------------------\n선택>>");
			sel = key.nextInt();
			switch (sel) {
			case 1:
				System.out.print("입금액:");
				money += key.nextLong();
				break;
			case 2:
				System.out.print("출금액:");
				money -= key.nextLong();
				break;
			case 3:
				System.out.printf("잔고출력:%d\n1", money);
				break;
			case 4:
				System.out.print("프로그램 종료");
				break outter;
			}
		} while (true);

	}

}
