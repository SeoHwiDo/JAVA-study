package week5;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		do {
			System.out.print("���� ������ �Է��ϼ���>>");
			 value= input.nextInt(); 
		 if (value == 0) {
			System.out.print("0�Դϴ� �ٽ� �Է��� �ּ���\n");
			 
		} else if(value<0) {
			System.out.print("���� �����Դϴ� �ٽ� �Է��� �ּ���\n");
			
		}
		 }while (value<0||value==0); {
				for(int re=0, i =1;i<=value;i++) {
				re = value%i;
				if(re==0)
					System.out.print(i+" ");
				}System.out.print("\n���α׷� ����");
		 }
	}	
}
