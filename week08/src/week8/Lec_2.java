package week8;
import java.util.*;
public class Lec_2 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int[] seats=new int[10];
		while(true) {
			System.out.print("���ϴ� �¼��� �Է��ϼ���(����� -1)");
			int s=scan.nextInt();
			if(s==-1)
				break;
			if(seats[s-1]==0) {
				seats[s-1]=1;
				System.out.println("����Ǿ����ϴ�");
			}else {
				System.out.println("�̹� ����� �ڸ� �Դϴ�");
			}
			System.out.println("-------------------");
			for(int i=0;i<seats.length;i++) 
				System.out.print((i+1)+" ");
			System.out.println("\n-------------------");
			for(int j:seats)
				System.out.print(j+" ");
			System.out.println("\n-------------------");
		}System.out.print("���α׷� ����");
	}
	
}
