package week4;
import java.util.Scanner;
public class Function {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("x의 값을 입력하세요:");
		int x=input.nextInt(),f;
		if(x<=0) {
			f=(x*x*x)-9*x+2;
			System.out.printf("함수의 값은%d입니다.",f);
		}else if(x>0){
			f=7*x+2;
			System.out.printf("함수의 값은%d입니다.", f);
		}
	}
	
}
