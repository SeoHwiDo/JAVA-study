package week6;

public class PlusFor {
	public static void main(String[] args) {
		int k=0,hap1=0,hap2 = 0;
		for (int i = 1; i<=4; i++) {
				for (int j = 1; j<=i; j++) {
					k++;
					hap1 += k;
					System.out.printf("1~%1$d까지의 합:%2$d\n", k, hap1);
					hap2+=hap1;
				}
			}System.out.printf("total:%d",hap2);

		}
	}


