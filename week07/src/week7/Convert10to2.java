package week7;
import java.util.*;
public class Convert10to2 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int binary[]=new int[8],ten,ten1,ten2;
		 
		System.out.print("0~255������ ������ �Է��Ͻÿ�>>");
		ten=scan.nextInt();
		ten1=ten;
		for(int i=0;i<binary.length;i++) {
			ten2=ten1%2;
			ten1/=2;
			binary[i]=ten2;
		}System.out.printf("������%d�� ���� ������\n",ten);
		for(int j=7;j>=0;j--) {
			System.out.print(binary[j]+" ");
		}
		System.out.print("\nprogram stop");	
	}
}
	