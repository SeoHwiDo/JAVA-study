package week6;

import java.util.*;

public class BigScan {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int max = 0, value = 1;
		outter: while (true) {
			if (value == 0 || value < 0) {
				break outter;
			} 
			else {
				System.out.print("������ �Է� �ϼ���___");
				value = key.nextInt();
			}
			

			if (value > max)
				max = value;
		}
		System.out.printf("max=%d\n���α׷� ����", max);// max�� ����� �� ���
	}
		
}
