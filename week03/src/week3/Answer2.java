package week3;
import java.util.Scanner;
public class Answer2{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String name;
		int year;
System.out.print("나이와 태어난 해를 입력하세요: ");
//본인의 이름을 키보드로 입력 받아 name에 저장하시오 – 본인작성
name = input.next();
year = input.nextInt();	
//자신이 태어난 해를 키보드로 입력 받아 year에 저장하시오. – 본인작성
System.out.printf("저의 이름은 %1$s 입니다.\n제가 태어난 해는 %2$d 입니다",name,year);//제시된 결과처럼 출력되도록 문장을 작성하시오.
	}
}
