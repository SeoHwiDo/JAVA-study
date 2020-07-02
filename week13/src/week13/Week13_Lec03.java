package week13;

class Book {
	private String title, page, author;

	public Book(String t, String p, String a) {
		title = t;
		page = p;
		author = a;
	}

	public Book() {
		this("", "", "");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String p) {
		page = p;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String a) {
		author = a;
	}

	public void showInfo(String str) {
		System.out.println("===" + str + "��ü ===");
		System.out.println("å �̸� :" + title);
		System.out.println("������ �� :" + page);
		System.out.println("���� :" + author);
	}
}

class Magazine extends Book {
	private String date;

	public Magazine(String t, String p, String a, String d) {
		super(t, p, a);
		date = d;
	}

	public Magazine() {
		super();
		date = null;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String d) {
		date = d;
	}

	@Override
	public void showInfo(String str) {
		super.showInfo(str);
		System.out.println("�߸��� :" + date);
	}
}

public class Week13_Lec03 {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("���� ����Ʈ����", "200", "��ҿ�", "2020�� 5�� 31��");
		Magazine bookB = new Magazine("�ְ�IoT", "100", "�ּ���", "2020�� 6�� 23��");

		bookA.showInfo("bookA");
		System.out.println();
		bookB.showInfo("bookB");

	}
}
