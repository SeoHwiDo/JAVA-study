package week3;

import java.util.Scanner;  //�Է��� ���� Scanner Ŭ���� ����
public class InputTest3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // �Է��� ����Scanner ��ü ����
		int data, temp;		

		System.out.print("������ �Է��Ͻÿ�: "); // �Է� �ȳ� ���
		 data=input.nextInt();
		
		 System.out.println("�Էµ� ������ " + data + " �Դϴ�");
		 temp = data++;
		 System.out.println("�Էµ� �������� 1�����ϸ� " + data + " �Դϴ�");
		 System.out.println("���� temp�� ����� ���� " + temp + " �Դϴ�");
++data;
		 System.out.println("�Էµ� �������� 1�����ϸ� " + data + " �Դϴ�");
	} //main() �޼ҵ� ��
} //InputTest3 Ŭ���� ��
