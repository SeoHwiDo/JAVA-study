package week9;

import java.util.*;
public class Week{
public enum Weeks {
	LOGIN_SUCCESS,LOGIN_FAILED
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pass = 1234;
		Weeks week = null;
		System.out.print("pass>>");
		int answer = in.nextInt();

		if (answer == pass) {
			week = Weeks.LOGIN_SUCCESS;
		} else {
			week = Weeks.LOGIN_FAILED;
		}
		System.out.println(week);
	}
}
