package week11_11_Lec03;

import java.util.*;

public class BookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book book1 = new Book();
		Book book2 = new Book();
		for (int i = 0; i < 2; i++) {
			System.out.println("����� �����̸� �Է��ϼ���:");
			String title = input.next();
			String writer = input.next();
			if (i == 0) {
				book1.setTitle(title);
				book1.setWriter(writer);
			} else
				book2.setTitle(title);
			book2.setWriter(writer);
		}
		System.out.print(book1);
		System.out.print(book2);
	}

}
