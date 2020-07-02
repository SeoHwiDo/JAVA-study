package week7;

import java.util.*;

public class CharForeach {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		char ch[]=new char[5];
		System.out.println("==문자 입력==");
		for(int i=0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		for(char j:ch) {
			System.out.print(j+" ");
		}System.out.println();
		for(int k:ch) {
			if(k >= 'a' && k <= 'z')
		         k -= 32;  //대문자 변환
		     else
		         k += 32; //소문자 변환 
			System.out.print((char)k+" ");
		}
		System.out.print("\n프로그램 종료");
	}
}
