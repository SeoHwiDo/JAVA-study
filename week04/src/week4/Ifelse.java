package week4;
import java.util.Scanner;
public class Ifelse {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int x,y;
		System.out.print("한개의 정수를 입력하시오:");
		x=input.nextInt();
		y=x%4;
		if(y==0) 
			System.out.printf("입력정수%d--->4의 배수",x);
		else
			System.out.printf("입력정수%d--->4의 배수가 아닙니다.",x);
	}
}
