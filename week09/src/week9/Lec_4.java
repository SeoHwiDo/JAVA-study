package week9;

public class Lec_4 {
	public static int big(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

	public static void write(String message, int value) {
		System.out.println(message + value);
	}

	public static void main(String[] args) {
		int rdn1 = (int) (Math.random() * 15) + 1, rdn2 = (int) (Math.random() * 15) + 1, max = big(rdn1, rdn2);
		write("积己等 抄荐1:", rdn1);
		write("积己等 抄荐2:", rdn2);
		write("max:", max);

	}

}
