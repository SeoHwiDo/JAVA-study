package week9;

public class Lec_5 {
	public static void init_array(int[]dim) {
		for(int i=0;i<dim.length;i++) {
			dim[i]=(int)(Math.random()*50)+1;
		}

	}
	public static void write(int[]dim,String message) {
		System.out.println("===="+message+"====");
		for(int value:dim)
			System.out.print(value+" ");
		System.out.println();
	}
	public static void main(String[]args) {
		int[] arr1=new int[7];
		System.out.println("�迭�� �ʱ�ȭ�մϴ�");
		init_array(arr1);
		System.out.println("�迭���Ҹ� ����մϴ�");
		write(arr1,"�迭:arr1");
	}
}
