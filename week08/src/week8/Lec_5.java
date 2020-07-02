package week8;

public class Lec_5 {
	public static void main(String[] args) {
		int[] arr = new int[7];
		System.out.println("-----------배열 원소 출력----------");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 90) + 10;
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n-----------최대 &최소 출력----------");
		int max = 0, min = 100, index1 = -1, index2 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index1 = i;
			} else if (arr[i] < min) {
				min = arr[i];
				index2 = i;
			}

		}
		System.out.printf("max:%1$d\tindex:%2$d\nmin:%3$d\tindex:%4$d", max, index1, min, index2);
	}
}
