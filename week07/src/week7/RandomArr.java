package week7;
import java.util.*;
public class RandomArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] digit;

		System.out.print("�迭 ũ�⸦ �Է��Ͻÿ� >> ");
		int  size = scan.nextInt();
		digit = new int[size];  //�Է� ���� ����ŭ �迭 ����
		for(int i=0;i<digit.length;i++) {
			digit[i]=(int)(Math.random()*size)+1;
			System.out.print(digit[i]+"\t");
		}System.out.println();
		for(int j=size-1;j>=0;j--)
			System.out.print(digit[j]+"\t");
		//���� �ۼ�

		System.out.println("\n program stop");
		}

}
