package week3;
import java.util.Scanner;// Scanner Ŭ���� import
public class Answer1{
public static void main(String[]args) {  //main() ��� ����
int salary;//������ �����ϱ� ���� int�� ���� salary ����
long pay;//������ ����Ͽ� �����ϱ� ���� long�� ���� pay ���� 
Scanner input = new Scanner(System.in);

System.out.print("������ �Է��Ͻÿ�: ");  // �Է� �ȳ� ���
salary = input.nextInt();//�Է� ���� ���� ���� salary�� ����
pay =(long)(salary*12);//����(���� * 12)�� ����Ͽ� pay�� ����
System.out.println("������"+salary+"������"+pay);//������ ������ ���
} 
} 
