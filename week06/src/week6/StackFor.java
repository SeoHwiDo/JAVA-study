package week6;
import java.util.*;
public class StackFor {
	public static void main(String[]args) {
		Scanner key=new Scanner(System.in);
		System.out.print("높이를 입력하세요>>");
		int k=0,h=key.nextInt();
		
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=i;j++) {
				k++;
				System.out.print(k+"\t");
			}System.out.println();
		}
		
	}

}
