package week5;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		do {
			System.out.print("양의 정수를 입력하세요>>");
			 value= input.nextInt(); 
		 if (value == 0) {
			System.out.print("0입니다 다시 입력해 주세요\n");
			 
		} else if(value<0) {
			System.out.print("음의 정수입니다 다시 입력해 주세요\n");
			
		}
		 }while (value<0||value==0); {
				for(int re=0, i =1;i<=value;i++) {
				re = value%i;
				if(re==0)
					System.out.print(i+" ");
				}System.out.print("\n프로그램 종료");
		 }
	}	
}
