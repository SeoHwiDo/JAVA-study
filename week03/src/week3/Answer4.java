package week3;
import java.util.Scanner;
public class Answer4 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in); //입력 객체 생성
		 float data;//입력된 실수를 저장하기 위한 변수 data 선언 – 본인 작성
		 String result;//문자열을 저장하기 위한 변수 result 선언 – 본인 작성
		System.out.print("실수 입력: ");
		data=in.nextFloat();//입력된 실수를 변수 data에 저장 – 본인 작성
		result = data>0 ? "양수 입니다" : "음수 입니다";  //음수와 양수를 판단 
		System.out.println("입력된 실수"+data+"는"+result);//결과 출력 – 본인 작성
		in.close();
	}
}

