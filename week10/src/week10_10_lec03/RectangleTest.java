package week10_10_lec03;
//Rectangle 클래스의 객체를 생성하고 테스트하는 클래스

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
	 Rectangle rec= new Rectangle();//Rectangle 클래스 rec 선언 & 생성
	 Scanner key=new Scanner(System.in);
	 System.out.println("가로를 입력하세요 >> ");
	  rec.garo=key.nextDouble();//입력 받은 값을 가로 필드로 초기화
	 System.out.println("세로를 입력하세요 >> ");
	  rec.sero=key.nextDouble();//입력 받은 값을 세로 필드로 초기화
	  rec.area();//area()  호출
	}
} 

