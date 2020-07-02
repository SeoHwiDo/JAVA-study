package week10_10_lec06;
import java.util.*;
public class InfoTest {
	public static void main(String[]args) {
		Scanner SignUp=new Scanner(System.in);
		Info user1=new Info();
		Info user2=new Info();
		System.out.print("아이디를 입력하세요>>>");
		user1.id=SignUp.next();
		System.out.print("첫번째 객체 생성 완료\n아이디를 입력하세요>>>");
		user2.id=SignUp.next();
		System.out.print("두번째 객체 생성 완료");
		System.out.println();
		System.out.println("\n첫번째 객체의 아이디와 비밀번호 출력");
		user1.disPlay();
		System.out.println();
		System.out.println("두번째 객체의 아이디와 비밀번호 출력");
		user2.disPlay();
	}
}
