package week6;

import java.util.Scanner;

public class quiz4 {
	public static void main(String[]args) {
		Scanner key=new Scanner(System.in);
		char ch;
		do {
			System.out.print("���ڸ� �Է��ϼ���(����:q�Ǵ� Q�Է�)>>");
			ch=key.next().charAt(0);
			System.out.println("�Է¹����ڵ尪:"+(int)ch);
		}while(ch!='q'&&ch!='Q');
			System.out.println("���α׷�����");
			
	}

}
