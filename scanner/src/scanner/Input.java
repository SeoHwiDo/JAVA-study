package scanner;
import java.util.Scanner;
class Input{
	public static void main(String[]args) {
		Scanner key=new Scanner(System.in);
		long data=(long) 10.2;
		int data1=key.nextInt();
		char data2=key.next().charAt(0);
		String data3=key.next();
		String data4=key.nextLine();
		System.out.printf("data=%d",data);
	}
}


