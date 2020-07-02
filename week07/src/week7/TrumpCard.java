package week7;

public class TrumpCard {
	public static void main(String[] args) {
		String[] card = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] order = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int indexcard = 0, indexorder = 0, count = 0;
		String c, o;
		for (int i = 0; i < 5; i++) {
			indexcard = (int) (Math.random() * 4);
			indexorder = (int) (Math.random() * 13);
			c = card[indexcard];
			o = order[indexorder];
			count++;
			System.out.printf("%1$d:%2$sÀÇ %3$s\n", count, c, o);
			
		}
	}
}
