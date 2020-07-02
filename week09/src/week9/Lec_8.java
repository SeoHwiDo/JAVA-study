package week9;

public class Lec_8 {
	public static void histogram(int h) {
		System.out.print(h + "]");
		for (int i = 0; i < h; i++) {
			System.out.print("*");// histogram() 메소드 – 매개변수로 받은 정수값 만큼 ‘*’출력, 반환값은 없음
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] cnt = { 9, 4, 3, 6, 10, 2, 5 };
		for (int v : cnt)
			histogram(v);

	}
}