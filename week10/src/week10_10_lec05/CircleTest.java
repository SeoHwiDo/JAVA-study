package week10_10_lec05;

import java.util.*;

public class CircleTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Circle o = new Circle();
		System.out.print("�������� �Է��ϼ���>>>");
		o.r = key.nextDouble();
		System.out.print("1.����, 2.���ѷ�>> ����:");
		int sel = key.nextInt();
		switch (sel) {
		case 1:
			o.getArea();
			break;
		case 2:
			o.getCircum();
			break;
		default:
			System.out.print("�ش� �޴� ����");
			break;
		}
	}
}
