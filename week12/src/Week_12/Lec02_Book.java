package Week_12;

import java.util.*;

class Book {
	private String title, author, position;

	public Book(String title, String author, String position) {
		this.title = title;
		this.author = author;
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	void bookWrite() {
		String prompt = "����:" + title;
		prompt += " \t������:" + author;
		prompt += " \t��ġ:" + position;
		System.out.println(prompt);
	}
}

public class Lec02_Book {
	public static void search(Book[] book, String title) {
		boolean flag = true;
		for (Book b : book) {
			if (title.equals(b.getTitle())) {
				b.bookWrite();
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(title + ":�ش� ������ �������� �ʽ��ϴ�");
	}

	public static void main(String[] args) {
		Book[] book = new Book[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.print("����>>");
			String title = scanner.nextLine();
			System.out.print("������>>");
			String author = scanner.nextLine();
			System.out.print("��ġ>>");
			String position = scanner.nextLine();
			book[i] = new Book(title, author, position);
		}
		for (Book b : book)
			b.bookWrite();

		search(book, "�ѱռ�");
		search(book, "Į�� �뷡");

		scanner.close();

	}
}