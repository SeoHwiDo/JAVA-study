package week10_10_lec05;

public class Circle {
	double r;

	Circle() {
		this(0);
	}

	Circle(int r) {
		this.r = r;
	}

	void getArea() {
		System.out.print("�� ����:" + (r * r * 3.14));
	}

	void getCircum() {
		System.out.print("�� �ѷ�" + (2 * r * 3.14));
	}
}
