package week3;
import java.util.Scanner;
public class InputTest2 {
	  //�Է��� ���� Scanner Ŭ���� ����
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); // �Է��� ����Scanner ��ü ����
			double d1, d2;      //�Է��� �����͸� ������ ���� ����
			boolean logic;    // ����� �����ϱ� ���� ���� ����
			

			System.out.print("�Ǽ� �� ���� �Է� �Ͻÿ�: "); // �Է� �ȳ� ���
			 d1=input.nextDouble();
			 d2=input.nextDouble();
			 
			 logic = d1>d2;  //ũ�� ��, ����� boolean ��
			 System.out.println(d1 +" > " + d2 + " => " + logic);  
			 
			 logic = d1 != d2;
			 System.out.println(d1 +" != " + d2 + " => " + logic);
		} //main() �޼ҵ� ��
	} //InputTest2 Ŭ���� ��

