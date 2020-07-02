package week9;

public class Lec_6 {
	
		public static int max(int[] dim) {
			int j=0;
			for(int i:dim) {
				if(j<i) {
					j=i;//max() 메소드 선언 – 본인 작성
				}
			}return j;
			
		}
		public static void main(String[] args) {
				int[] isource= {21, 34, 76, 38, 11, 8, 56, 98, 64};  
				int m=max(isource);
				System.out.println("MAX = " +m);
		}

	}

