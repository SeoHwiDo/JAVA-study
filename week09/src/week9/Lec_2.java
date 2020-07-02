package week9;

public class Lec_2 {
	public static void array_print(String[]string) {
		for(String value:string)
		System.out.print(value);
	}
	public static void main(String[]args) {
		String[] card = {"Clubs", "Diamonds", "Hearts", "Spades"};
		array_print(card);
	}
}
