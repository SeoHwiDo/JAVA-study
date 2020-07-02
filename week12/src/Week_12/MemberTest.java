package Week_12;

import java.util.*;

class Member {
	private String id;
	private int pass;// 필드 선언 : id(String, private), pass(int, private)

	Member() {
		this(" ", 0);
	}

	Member(String id, int pass) {
		this.id = id;
		this.pass = pass;// 생성자 – 매개변수값을 필드로 초기화
	}

	public String getId() {
		return id;// id, pass 필드에 대한 getter, setter
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String toString() {
		return "[id=" + getId() + "]";// 객체의 id필드값만 문자열로 반환하는 toString() 메소드
	}

	public boolean isCheck(String id, int pass) {
		boolean flag;
		if (id.equals(getId()) && pass == getPass())
			flag = true;// 매개변수로 받은 id, pass를 비교하여 같으면 true, 다르면 false 반환하는 isCheck() 메소드
		else
			flag = false;
		return flag;
	}

}

class MemberTest {
	public static void main(String[] args) {
		Member[] mem = { new Member("java", 2020), new Member("script", 1938), new Member("Python", 2018),
				new Member("web", 2171) };
		Scanner scan = new Scanner(System.in);
		boolean b1 = true, b2 = false;
		String log = null;
		for (int i = 0; i < 2; i++) {
			if (b1) {
				log = "login";
				b1 = false;
			} else
				log = "logout";
			System.out.print(log + ":id와 패스워드를 입력하세요>>");
			String id = scan.next();
			int pass = scan.nextInt();

			for (Member m : mem) {
				if (m.isCheck(id, pass)) {
					System.out.println(m + log + "되었습니다");
					b2 = false;
					break;
				} else
					b2 = true;

			}
			if (b2)
				System.out.println(log + "할 수 없습니다");
			// 제시된 결과처럼 실행될 수 있도록 실행문 완성
		}
		scan.close();
	}
}
