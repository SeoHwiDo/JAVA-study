package week5;

import java.util.*;

public class Test99 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char go;
		int o = 0, i = 0, anst, ansy, num1, num2;
		System.out.print("구구단을 시작합니다\n");
		do {
			i++;
			num1 = (int) (Math.random() * 9) + 1;
			num2 = (int) (Math.random() * 9) + 1;
			anst = num1 * num2;
			System.out.printf("%1$d)%2$d*%3$d=", i, num1, num2);
			ansy = input.nextInt();
			System.out.print(anst == ansy ? "정답입니다\n종료하려면 n또는N을 입력하세요>>" : "오답입니다\n종료하려면 n또는N을 입력하세요>>");
			go = input.next().charAt(0);
			if (anst == ansy)
				o++;
		} while (go != 'n' && go != 'N');
		{
			System.out.printf("정답 횟수=%d\n프로그램 종료", o);

		}
	}
}
