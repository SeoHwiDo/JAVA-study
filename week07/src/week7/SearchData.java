package week7;
import java.util.*;
public class SearchData {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int value, index = -1;
		System.out.print("Ž���� ���� �Է� �Ͻÿ�: ");
		value = scan.nextInt();
		for(int i=0;i<s.length;i++) {
			if(s[i]==value) {
				index= i;
				break;
			}
		}
		if (index < s.length && index >= 0)
		    System.out.println("" + value + "���� " + index + "��ġ�� �ֽ��ϴ�.");
		else
		    System.out.println("�ش� �ڷᰡ �������� �ʽ��ϴ�");
		}

	}
	

