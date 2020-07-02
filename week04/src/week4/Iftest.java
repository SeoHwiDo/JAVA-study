package week4;

import java.util.*;
public class Iftest {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		char ch;	
		System.out.print("성적 입력: ");
		ch = input.next().charAt(0);//한 개의 문자를 입력하여 변수 ch에 저장 – 본인 작성

		if(ch == 'A') //입력한 문자가 ‘A’이면
			System.out.println("Excellent");
		else if(ch == 'B') //입력한 문자가 ‘B’이면
			System.out.println("Good");
else if(ch == 'C') //입력한 문자가 ‘B’이면
			System.out.println("Average");
		else if(ch == 'D') //입력한 문자가 ‘D’이면
			System.out.println("Passing");
		else if(ch == 'F') //입력한 문자가 ‘F’이면
			System.out.println("Faiure");
		else  //A~F 이외의 문자이면
	    	System.out.println("해당 사항 없음");
		}
}
