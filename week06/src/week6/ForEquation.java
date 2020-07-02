package week6;

public class ForEquation {
	public static void main(String[] args) {
		for (int x = 1; x <= 10&&x>=1; x++) {
			for (int y = 1; y <= 10&&y>=1; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.printf("(%1$d,%2$d)\n", x, y);
					break;

				}

			}

		}
		System.out.println("프로그램 종료");
	}

}
