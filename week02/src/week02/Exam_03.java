package week02;

import java.util.Scanner;  //�Է��� ���� Scanner Ŭ���� ���� 
public class Exam_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // �Է��� ����Scanner ��ü ����
		int x, y;      //�Է��� �����͸� ������ ���� ����
		int result;  // ����� �����ϱ� ���� ���� ����
		String str;

		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: "); // �Է� �ȳ� ���
		 x = input.nextInt(); //����ڷκ��� �Է� ���� ������ ���� x�� ����

		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: "); // �Է� �ȳ� ���
		 y = input.nextInt(); //����ڷκ��� �Է� ���� ������ ���� y�� ����
		 
		 result = x+y;
		 System.out.println(x +" + " + y + "=" +result);  
	} //main() �޼ҵ� ��
} // Exam_02  Ŭ���� ��
