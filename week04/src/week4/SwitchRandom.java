package week4;

import java.util.*;
public class SwitchRandom {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String ch;
		int rnd1, rnd2;

		System.out.print("연산자를 입력하세요 >>>  ");
		ch = key.next();

		rnd1 = (int) (Math.random() * 31) + 20; // 20~50사이의 난수 생성
		rnd2 = (int) (Math.random() * 31) + 20; // 20~50사이의 난수 생성

		switch (ch) {
		case "%":    // 변수 ch에 저장된 문자가 '%'이면 나머지 연산 실행
			System.out.println(rnd1 + " % " + rnd2 + " = " + (rnd1 % rnd2));
			break;
		case "/":    // 변수 ch에 저장된 문자가 '/'이면 나눗셈 연산 실행
			System.out.println(rnd1 + " / " + rnd2 + " = " + (rnd1 / rnd2));
			break;
		case "*":   // 변수 ch에 저장된 문자가 '*'이면 곱셈 연산 실행
			System.out.println(rnd1 + " * " + rnd2 + " = " + (rnd1 * rnd2));
			break;
		default:
			System.out.println("해당 연산자가 없습니다");
		}
		key.close();
	}
}
