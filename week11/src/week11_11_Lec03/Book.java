package week11_11_Lec03;

class Book {
	private String title, writer;

	public Book() {
		this("", "");
	}

	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String toString() {
		return "제목:" + getTitle() + "\t지은이:" + getWriter();
	}
}
