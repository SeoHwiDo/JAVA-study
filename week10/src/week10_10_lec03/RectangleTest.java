package week10_10_lec03;
//Rectangle Ŭ������ ��ü�� �����ϰ� �׽�Ʈ�ϴ� Ŭ����

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
	 Rectangle rec= new Rectangle();//Rectangle Ŭ���� rec ���� & ����
	 Scanner key=new Scanner(System.in);
	 System.out.println("���θ� �Է��ϼ��� >> ");
	  rec.garo=key.nextDouble();//�Է� ���� ���� ���� �ʵ�� �ʱ�ȭ
	 System.out.println("���θ� �Է��ϼ��� >> ");
	  rec.sero=key.nextDouble();//�Է� ���� ���� ���� �ʵ�� �ʱ�ȭ
	  rec.area();//area()  ȣ��
	}
} 

