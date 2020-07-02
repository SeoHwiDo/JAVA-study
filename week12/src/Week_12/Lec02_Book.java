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
		String prompt = "제목:" + title;
		prompt += " \t지은이:" + author;
		prompt += " \t위치:" + position;
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
			System.out.println(title + ":해당 도서가 존재하지 않습니다");
	}

	public static void main(String[] args) {
		Book[] book = new Book[2];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("지은이>>");
			String author = scanner.nextLine();
			System.out.print("위치>>");
			String position = scanner.nextLine();
			book[i] = new Book(title, author, position);
		}
		for (Book b : book)
			b.bookWrite();

		search(book, "총균쇠");
		search(book, "칼의 노래");

		scanner.close();

	}
}