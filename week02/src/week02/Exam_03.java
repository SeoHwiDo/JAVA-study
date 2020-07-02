package week02;

import java.util.Scanner;  //입력을 위한 Scanner 클래스 삽입 
public class Exam_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 입력을 위한Scanner 객체 생성
		int x, y;      //입력한 데이터를 저장할 변수 선언
		int result;  // 결과를 저장하기 위한 변수 선언
		String str;

		System.out.print("첫번째 숫자를 입력하시오: "); // 입력 안내 출력
		 x = input.nextInt(); //사용자로부터 입력 받은 정수를 변수 x에 저장

		System.out.print("두번째 숫자를 입력하시오: "); // 입력 안내 출력
		 y = input.nextInt(); //사용자로부터 입력 받은 정수를 변수 y에 저장
		 
		 result = x+y;
		 System.out.println(x +" + " + y + "=" +result);  
	} //main() 메소드 끝
} // Exam_02  클래스 끝
