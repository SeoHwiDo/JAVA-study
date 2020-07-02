package week3;

public class Calculator3 {
	public static void main(String[]args) {
		int d = 0;
		System.out.println((++d)+"\t"+(3<4 && 5<7));
		System.out.println((++d)+"\t"+(+3>4 || 5<7));
		System.out.println((++d)+"\t"+((3<4) ^ (5<7)));
		System.out.println((++d)+"\t"+(2+3 & 5));
		System.out.println((++d)+"\t"+(1 | 2 ));
		System.out.println((++d)+"\t"+(1 ^ 0));
		System.out.println((++d)+"\t"+(23 >> 2));
		System.out.println((++d)+"\t"+(2 << 2));
		System.out.println((++d)+"\t"+(20 >>> 3));
		System.out.println((++d)+"\t"+(2 < 3 ? 1 : 2));
		int v= 10;
		int k=v++ %5;
		System.out.println((++d)+"\t"+k);
	}
}