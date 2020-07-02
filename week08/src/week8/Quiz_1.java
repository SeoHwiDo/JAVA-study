package week8;

public class Quiz_1 {
	public static void main(String[]args) {
		double[][] twoDim = new double [3][4];
		//System.out.println(twoDim.length);
		int[][] arr = {{12,3,8},{5,7,6},{2,4,5}};
		//for(int i=0;i<arr.length;i++) {
			//for(int j=0;j<arr[i].length;j++)
				//System.out.print(arr[i][j]);
			//System.out.println();}
		System.out.print(arr[1][2]);
		boolean[] bool=new boolean[10];
		for(boolean i:bool)
		i = false;
		int x=0;
		for(boolean i:bool)
			System.out.printf("%d)",x,i ? "true":"false");
	}
}
