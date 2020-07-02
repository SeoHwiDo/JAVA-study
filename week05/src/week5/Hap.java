package week5;

public class Hap {
	public static void main(String[]args) {
		int hap=0,i=0;
		while(i<=50) {
			i++;
			if(i%3!=0&&i%4!=0) {
				System.out.print(i+" ");
				hap+=i;
			}
		}
		System.out.print("\nhap ="+hap+"\n프로그램 종료");
	}
}
