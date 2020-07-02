package week9;

public class Lec_1 {
	public static void print() {
		System.out.println("\n--------------------------");
	}
	public static void main(String[]args) {
		int[][] array= {{2,3,4},{8,5,6}};
		print();	
		for(int[] row:array) {
			for(int data:row) 
				System.out.printf("%5d",data);
			print();
		}
		
	}
}
