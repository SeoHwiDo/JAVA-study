package week5;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0,value = 0;
		float hap = 0.0f, avr = 0.0f;
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ���\n");
		do {
			value = input.nextInt();
			if (value != -1) {
				i++;
				hap += value;
			}
		} while (value != -1);
		{
			if (i > 0) {
				avr = hap / i;
				System.out.print("������ ������" + i + "���̸� �����" + avr + "�Դϴ�.\n���α׷� ����");
			} else if(i==0) {
				System.out.print("�Էµ� ���� �����ϴ�.\n���α׷� ����");
			}
		}
	}
}
