package week6;

import java.util.Scanner;

public class quiz4 {
	public static void main(String[]args) {
		Scanner key=new Scanner(System.in);
		char ch;
		do {
			System.out.print("문자를 입력하세요(종료:q또는 Q입력)>>");
			ch=key.next().charAt(0);
			System.out.println("입력문자코드값:"+(int)ch);
		}while(ch!='q'&&ch!='Q');
			System.out.println("프로그램종료");
			
	}

}
