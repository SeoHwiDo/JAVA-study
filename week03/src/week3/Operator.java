package week3;

public class Operator {
	public static void main(String[] args) {
		int x = 0xf3a2, y = 0xb7c1, data=23;
		boolean b1 = true, b2 = false;
		String result;

//����data�� ����� ���� ¦������ Ȧ������ �Ǵ��Ͽ� ����� result�� ����-���� ������
		result=data%2==0?"¦��":"Ȧ��";

// x, y �� ����� ���� 2������ ���
		System.out.println(" x= " + Integer.toBinaryString(x));	
	 System.out.println(" y= " + Integer.toBinaryString(y)); 

            // ��Ʈ ���� ��� 2������ ���
	System.out.println("1: x & y = " + Integer.toBinaryString(x & y));		       System.out.println("2: x | y = " + Integer.toBinaryString(x | y));
		System.out.println("3: ~x = " + Integer.toBinaryString(~x));

// �� ���� ��� ���
		System.out.println("4: b1 & b2 = " + (b1 & b2));
		System.out.println("5: b1 && b2 = " + (b1 && b2));
		System.out.println("6: b1 || b2 = " + (b1 || b2));
		System.out.println("7: b1 ^ b2 = " + (b1 ^ b2));

// ���� ���� ��� ���
		System.out.println("8:  data%2==0?\"¦��\":\"����\" => " + result);
	}
}