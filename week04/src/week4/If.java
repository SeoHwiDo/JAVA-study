package week4;

public class If {
public static void main(String[]args) {
	String x="ch";
	if('c'>='a'&&'c'<='z'&&'h'>='a'&&'h'<='z'){
		{
			if('C'>='a'&&'c'<='z'&&'h'>='a'&&'h'<='z'){
				System.out.print("�ҹ���");
			}else {
				System.out.print("�ҹ��� �ƴմϴ�");
			}
			double gpa = 3.5;
			if ( gpa >= 4.0 ) {
				System.out.println("�������.");
				System.out.println("������ǰ����.");
			}else {
				System.out.println( "������ 4.0 �̸�");
			}
			
			char type = 'm';
			if (type == 'm')
				System.out.println("�����Դϴ�.");
				else if (type == 'w')
				System.out.println("�����Դϴ�.");
			int a = 11;
			if ( a%2==0 )
				System.out.println("a�� ¦���̴�.");
				else 
				System.out.println("a�� Ȧ���̴�.");
			int count = 0;
			if ( count >0&&count<0 )
				System.out.println("count�� 0�� �ƴմϴ�.");
				else
				System.out.println("count�� 0�Դϴ�."); 
	
			float grade = 4.5f;
			switch((int) grade ){
				case (int)4.5:
					System.out.println("����");
					break;
				case (int) 0.0:
					System.out.println("����");
					break;
				default:
					System.out.println(grade);
				   
			}

}
}
}
}