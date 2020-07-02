package week8;

import java.util.*;

public class Lec_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("행과 열크기를 입력하세요>>>>");
		int num = 0, index, r = input.nextInt(), c = input.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				num++;
				arr[i][j] = num;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++)
					System.out.print(arr[i][j] + "  ");
			} else {
				for (int k = c - 1; k >= 0; k--) {
					System.out.print(arr[i][k] + "  ");
				}
			}
			System.out.println();
		}
	}
}
