package week4;
import java.util.Scanner;
public class Switchtest {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		char ch;	
		System.out.print("성적 입력: ");
		ch = input.next().charAt(0);//한 개의 문자를 입력하여 변수 ch에 저장 – 본인 작성
		switch(ch) {
		case 'A'://입력한 문자가 ‘A’이면
			System.out.println("Excellent");
			break;
		case 'B': //입력한 문자가 ‘B’이면
			System.out.println("Good");
			break;
		case 'C': //입력한 문자가 ‘B’이면
			System.out.println("Average");
			break;
		case 'D': //입력한 문자가 ‘D’이면
			System.out.println("Passing");
			break;
		case 'F': //입력한 문자가 ‘F’이면
			System.out.println("Faiure");
			break;
		default:  //A~F 이외의 문자이면
	    	System.out.println("해당 사항 없음");
		}	
}
}