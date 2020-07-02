package week3;

public class Calculator2 {
	public static void main(String[]args) {
	 double x=3.4;
	 double y=7.9;
	 double z=1.5;
	 int a=1;
	 double dsum;
	 boolean bsum;
	 dsum= x + y;
	 System.out.println(a++ +"\t" +dsum);
	 dsum= (int) x + y;
	 System.out.println(a++ +"\t" +dsum);
	 dsum= (int) x + (int) y;
	 System.out.println(a++ +"\t" +dsum);
	 dsum= (int) (x + y);
	 System.out.println(a++ +"\t" +dsum);
	 dsum= (int) (x + y + z);
	 System.out.println(a++ +"\t" +dsum);
	 bsum= x > y + 2;
	 System.out.println(a++ +"\t" +bsum);
	 bsum= x <= z * 2;
	 System.out.println(a++ +"\t" +bsum);
	 bsum= x == z + 1.9;
	 System.out.println(a++ +"\t" +bsum);
	 bsum= x != z - y;
	 System.out.println(a++ +"\t" +bsum);
	 bsum= x + y >= y + z;
	 System.out.println(a++ +"\t" +bsum);
	}

}
