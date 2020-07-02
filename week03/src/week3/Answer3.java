package week3;
import java.util.Scanner;
public class Answer3 {
	public static void main(String[]args) {
		System.out.print("오랜지의 개수를 입력하시오:");
		Scanner input= new Scanner(System.in);
		int orange=input.nextInt();
		int box;
		int other;
		box=orange/10;
		other=orange%10;
		System.out.printf("%1$d박스가 필요하고 %2$d개가 남습니다.",box,other);
	}
}
