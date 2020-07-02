package week3;
import java.util.Scanner;
public class InputTest2 {
	  //입력을 위한 Scanner 클래스 삽입
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); // 입력을 위한Scanner 객체 생성
			double d1, d2;      //입력한 데이터를 저장할 변수 선언
			boolean logic;    // 결과를 저장하기 위한 변수 선언
			

			System.out.print("실수 두 개를 입력 하시오: "); // 입력 안내 출력
			 d1=input.nextDouble();
			 d2=input.nextDouble();
			 
			 logic = d1>d2;  //크기 비교, 결과는 boolean 형
			 System.out.println(d1 +" > " + d2 + " => " + logic);  
			 
			 logic = d1 != d2;
			 System.out.println(d1 +" != " + d2 + " => " + logic);
		} //main() 메소드 끝
	} //InputTest2 클래스 끝

