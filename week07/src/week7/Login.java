package week7;

import java.util.*;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id[] = { "linux", "unix", "window", "iOS", "android", "dos", "debian" }, scan;
		int pass[] = new int[id.length], index = -1;
		System.out.print("==== 생성된 비밀번호 출력 ====\n");
		for (int i = 0; i < pass.length; i++) {
			pass[i] = (int) (Math.random() * 899) + 100;
			System.out.printf("id=%s  \t", id[i]);
			System.out.printf("pass=%d\n", pass[i]);
		}
		System.out.println("==== id를 입력하세요 ====");
		scan = input.nextLine();
		for (int j = 0; j < id.length; j++) {
			if (scan.equals(id[j])) {
				index = j;
				break;
			}
		}if (index < id.length && index >= 0)
			System.out.printf("입력한 id %1$s의 비밀번호는 %2$d입니다\n프로그램 종료", scan, pass[index]);
	}
}
