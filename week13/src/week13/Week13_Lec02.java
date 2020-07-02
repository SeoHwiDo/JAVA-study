package week13;

class Food {
	private int cost, kg;

	public Food(int co, int k) {
		cost = co;
		kg = k;
	}

	public Food() {
		this(0, 0);
	}

	public void setCost(int co) {
		cost = co;
	}

	public int getCost() {
		return cost;
	}

	public void setKg(int k) {
		kg = k;
	}

	public int getKg() {
		return kg;
	}

	@Override
	public String toString() {
		return "cost=" + cost + "	kg=" + kg;

	}
}

class Melon extends Food {
	private String info;

	public Melon(int co, int k, String info) {
		super(co, k);
		this.info = info;
	}

	public Melon() {
		super();
		info = null;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public String toString() {
		String str = super.toString();
		str += "	경작 농원=" + this.info;
		return str;
	}

}

public class Week13_Lec02 {
	public static void main(String[] args) {
		Melon m1 = new Melon(2500, 21, "Hallym_farm");
		Melon m2 = new Melon(2000, 10, "Software_farm");

		System.out.println("m1 객체 정보 [" + m1 + "]");
		System.out.println("m2 객체 정보 [" + m2 + "]\n");

		System.out.println(">>m2 객체의 cost와 경작농원 변경 후");
		m2.setCost(3000);
		m2.setInfo("Java_farm");
		System.out.println(m2 + "\n");
		System.out.println("m1:중량>>" + m1.getKg());
		System.out.print("프로그램 종료");
	}

}