package week11_11_Lec01;

import java.util.*;

public class ServiceTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Service ser = new Service();
		for (int i = 0; i < 2; i++) {
			System.out.println("id와 패스워드를 입력하세요>>");
			String id = key.next();
			int pass = key.nextInt();
			if (ser.login(id, pass) == true)
				System.out.println("로그인 되었습니다");
			else
				System.out.println("로그인 실패");
			ser.logout(id);
		}

	}
}
