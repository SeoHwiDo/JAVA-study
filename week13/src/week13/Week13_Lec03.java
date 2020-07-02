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
		System.out.println("===" + str + "객체 ===");
		System.out.println("책 이름 :" + title);
		System.out.println("페이지 수 :" + page);
		System.out.println("저자 :" + author);
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
		System.out.println("발매일 :" + date);
	}
}

public class Week13_Lec03 {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("월간 소프트웨어", "200", "김소월", "2020년 5월 31일");
		Magazine bookB = new Magazine("주간IoT", "100", "주소윤", "2020년 6월 23일");

		bookA.showInfo("bookA");
		System.out.println();
		bookB.showInfo("bookB");

	}
}
