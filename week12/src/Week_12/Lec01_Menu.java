package Week_12;

import java.util.*;

class Menu {
	private int rand, cost;
	private String menu;
	private static int num;

	public Menu(int rand, String menu, int cost) {
		this.rand = rand;
		this.menu = menu;
		this.cost = cost;
		++num;
		;
	}

	public int getCost() {
		return cost;
	}

	public String toString() {
		return num + ") Menu [����=" + rand + ",�޴�=" + menu + ",����=" + cost + "]";
	}
}

class Manage {
	final static String[] menu = { "īǪġ��", "����������", "�Ƹ޸�ī��", "ī���", "�ڸ����̵�" };
	final static int[] value = { 3000, 2000, 2500, 3500, 4000 };

	public static Menu creation() {
		int rnd = (int) (Math.random() * 5) + 1;
		Menu m = new Menu(rnd, menu[rnd - 1], value[rnd - 1]);
		return m;
	}
}

public class Lec01_Menu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Menu menu = null;
		int total = 0;
		System.out.print("�ο����� �Է��ϼ���>>");
		int cnt = key.nextInt();
		for (int i = 0; i < cnt; i++) {
			menu = Manage.creation();
			System.out.println(menu);
			total += menu.getCost();
		}
		System.out.print("�ֹ��հ�:" + total);
	}
}