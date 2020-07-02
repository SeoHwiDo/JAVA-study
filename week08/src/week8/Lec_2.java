package week8;
import java.util.*;
public class Lec_2 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int[] seats=new int[10];
		while(true) {
			System.out.print("원하는 좌석을 입력하세요(종료는 -1)");
			int s=scan.nextInt();
			if(s==-1)
				break;
			if(seats[s-1]==0) {
				seats[s-1]=1;
				System.out.println("예약되었습니다");
			}else {
				System.out.println("이미 예약된 자리 입니다");
			}
			System.out.println("-------------------");
			for(int i=0;i<seats.length;i++) 
				System.out.print((i+1)+" ");
			System.out.println("\n-------------------");
			for(int j:seats)
				System.out.print(j+" ");
			System.out.println("\n-------------------");
		}System.out.print("프로그램 종료");
	}
	
}
