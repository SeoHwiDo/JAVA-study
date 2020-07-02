package week8;

public class Lec_3 {
 public static void main(String[]args) {
	 int[][] ragged = new int[5][];
	 int k=0;
	 for(int i=0;i<ragged.length;i++) {
		 ragged[i]=new int[i+1];
	 }
	 for(int i=0;i<ragged.length;i++) {
		 for(int j=0;j<ragged[i].length;j++)
			 ragged[i][j]=++k;
	 }for(int[] row:ragged) {
		 for(int data:row)
			 System.out.print(data+"\t");
		 	System.out.println();
 }
	 
 }
}
