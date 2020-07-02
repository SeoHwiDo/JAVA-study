package week5;
import java.util.*;
public class Countch {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		char ch;
		int b=0,s=0;
		for(int i=1;i<=10;++i) {
			System.out.printf("%d)>>",i);
			ch=input.next().charAt(0);
			if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자 입니다");
			s++;
			}else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자 입니다");
			b++;
			}else {
			System.out.println("영문자가 아닙니다.");
			i--;
			}
		}System.out.printf("\n소문자 개수=%1$d\n대문자 개수=%2$d\n프로그램 종료",s,b);

	}
}
