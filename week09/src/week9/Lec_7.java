package week9;
import java.util.*;
public class Lec_7 {
	//�Ʒ��� �޼ҵ� ������ ���� �ۼ�
	public static String menuAt(int rernd) {
		String[] menulist= {"īǪġ��","����������","�Ƹ޸�ī��","ī���","�ڸ����̵�"};
		String pick = null;
		for(int i=0;i<menulist.length;i++) {
			if(i==rernd-1)
				pick=menulist[i];// menuAt() �޼ҵ� ���� - ������ ������ �Ű������� �޾� �޴��� ��ȯ�ϴ� �޼ҵ�
		}return pick;
	}
	public static int valueAt(int rernd) {
		int[] menuvalue= {3000,2000,2500,3500,4000};
		int pick = 0;
		for(int i=0;i<menuvalue.length;i++) {
			if(i==rernd-1)
				pick=menuvalue[i];// menuAt() �޼ҵ� ���� - ������ ������ �Ű������� �޾� �޴��� ��ȯ�ϴ� �޼ҵ�
		}return pick;// valueAt() �޼ҵ� ���� - ������ ������ �Ű������� �޾� ������ ��ȯ�ϴ� �޼ҵ�
	}
	public static int input(String guide) {
		System.out.print(guide);
		Scanner key=new Scanner(System.in);
		int p=key.nextInt();
		return p;// input() �޼ҵ� ���� -������Ʈ ���ڿ��� �Ű������� ������ �޼ҵ忡�� �Է� ���� ������ ��ȯ�ϴ� �޼ҵ�
	}

	public static void main(String[] args) {
		int total = 0;
		int count = input("�ο����� �Է��ϼ��� >> "); // input() ȣ��
		for (int i = 0; i < count; i++) {
			int rnd = (int) (Math.random() * 5) + 1;
			int value = valueAt(rnd); // valueAt() �޼ҵ� ȣ��, ������ ��ȯ�޴´�
			String menu = menuAt(rnd); // menuAt() �޼ҵ� ȣ��, �޴��� ��ȯ�޴µ�
			System.out.println("���� : " + rnd + ", �޴� : " + menu + ", ���� : " + value);
			total += value;
		}

		int money = input("�ֹ��հ� : " + total + "  >> "); // input() ȣ��, ����ڷκ��� ���� ���� ��ȯ
		System.out.println("���� �� : " + money);
		System.out.println(money - total != 0 ? "�Ž��� �� : " + (money - total) : "�Ž��� �� ����");
	}
}

