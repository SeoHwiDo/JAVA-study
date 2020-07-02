package week5;

public class Fortest {
	public static void main(String[]args) {
		
		for(int hap=0,i=15;i>=1;) {
			hap=hap+i;
			System.out.printf("i=%1$d, hap=%2$d\n",i,hap);
			i-=2;
		}
	}
}
