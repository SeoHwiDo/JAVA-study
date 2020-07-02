package week3;
import java.util.Scanner;
public class Answer5 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		double topline,bottomline,high,area;
		System.out.println("윗변 데이터를 입력하세요>>");
		topline=input.nextDouble();
		System.out.println("아랫변 데이터를 입력하세요>>");
		bottomline=input.nextDouble();
		System.out.println("높이 데이터를 입력하세요>>");
		high=input.nextDouble();
		area=(topline+bottomline)*high/2;
		System.out.print("사다리꼴 넓이: "+area);
		String String = "asa";
	}
}
