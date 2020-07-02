package week3;

import java.util.Scanner;  //입력을 위한 Scanner 클래스 삽입
public class InputTest3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 입력을 위한Scanner 객체 생성
		int data, temp;		

		System.out.print("정수를 입력하시오: "); // 입력 안내 출력
		 data=input.nextInt();
		
		 System.out.println("입력된 정수는 " + data + " 입니다");
		 temp = data++;
		 System.out.println("입력된 정수값을 1증가하면 " + data + " 입니다");
		 System.out.println("변수 temp에 저장된 값은 " + temp + " 입니다");
++data;
		 System.out.println("입력된 정수값을 1증가하면 " + data + " 입니다");
	} //main() 메소드 끝
} //InputTest3 클래스 끝
