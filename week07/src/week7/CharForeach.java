package week7;

import java.util.*;

public class CharForeach {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		char ch[]=new char[5];
		System.out.println("==���� �Է�==");
		for(int i=0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		for(char j:ch) {
			System.out.print(j+" ");
		}System.out.println();
		for(int k:ch) {
			if(k >= 'a' && k <= 'z')
		         k -= 32;  //�빮�� ��ȯ
		     else
		         k += 32; //�ҹ��� ��ȯ 
			System.out.print((char)k+" ");
		}
		System.out.print("\n���α׷� ����");
	}
}
