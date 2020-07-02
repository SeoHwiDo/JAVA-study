package week7;
import java.util.*;
public class RandomArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] digit;

		System.out.print("배열 크기를 입력하시오 >> ");
		int  size = scan.nextInt();
		digit = new int[size];  //입력 받은 값만큼 배열 생성
		for(int i=0;i<digit.length;i++) {
			digit[i]=(int)(Math.random()*size)+1;
			System.out.print(digit[i]+"\t");
		}System.out.println();
		for(int j=size-1;j>=0;j--)
			System.out.print(digit[j]+"\t");
		//본인 작성

		System.out.println("\n program stop");
		}

}
