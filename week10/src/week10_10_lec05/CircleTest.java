package week10_10_lec05;

import java.util.*;

public class CircleTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Circle o = new Circle();
		System.out.print("반지름을 입력하세요>>>");
		o.r = key.nextDouble();
		System.out.print("1.넓이, 2.원둘레>> 선택:");
		int sel = key.nextInt();
		switch (sel) {
		case 1:
			o.getArea();
			break;
		case 2:
			o.getCircum();
			break;
		default:
			System.out.print("해당 메뉴 없음");
			break;
		}
	}
}
