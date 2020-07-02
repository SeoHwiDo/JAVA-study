package week8;

public class Lec_1 {
	public static void main(String[]args) {
		int[] ran = new int[10];
		
		for(int i=0;i<ran.length;i++) {
			ran[i]=(int)(Math.random()*90)+10;
			System.out.print(ran[i]+"  "
					+ "");
		}System.out.println();
		int max=9;
		for(int j:ran) {
			if(max<j)
				max=j;
		}System.out.print("max="+max);
	}
}
