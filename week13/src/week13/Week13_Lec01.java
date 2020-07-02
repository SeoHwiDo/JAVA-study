package week13;

class Address {
	private String name;
	private String phone;

	public Address(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("전화:" + phone);
	}
}

class UnivAdd extends Address {
	private String major;

	public UnivAdd(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("전공:" + major);
	}
}

class CompAdd extends Address {
	private String department;

	public CompAdd(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("부서:" + department);
	}
}

public class Week13_Lec01 {
	public static void main(String[] args) {
		Address[] frns = new Address[10];
		int cnt = 0;

		frns[cnt++] = new UnivAdd("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivAdd("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompAdd("YOON", "R&D 1", "010-123-999");
		frns[cnt++] = new CompAdd("PARK", "R%D 2", "02-321-777");

		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}

	}
}