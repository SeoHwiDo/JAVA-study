package week11_11_Lec01;

import java.util.*;

public class ServiceTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Service ser = new Service();
		for (int i = 0; i < 2; i++) {
			System.out.println("id�� �н����带 �Է��ϼ���>>");
			String id = key.next();
			int pass = key.nextInt();
			if (ser.login(id, pass) == true)
				System.out.println("�α��� �Ǿ����ϴ�");
			else
				System.out.println("�α��� ����");
			ser.logout(id);
		}

	}
}
