package week5;

public class Dice {
	public static void main(String[] args) {
		int dice1, dice2, hap, i = 0;
		do {
			i++;
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			hap = dice1 + dice2;
			System.out.printf("%1$dȸ:(%2$d,%3$d)=%4$d\n", i, dice1, dice2, hap);
		} while (hap != 6);

	}
}