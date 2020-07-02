package week11_11_Lec02;

public class PersonTest {
	public static void main(String[]args) {
		Person per1=new Person();
		Person per2=new Person();
		per1.setName("김화수");
		per2.setName("한유남");
		System.out.printf("name:%1$s\tyear:%2$s\tmask:%3$s\n",per1.getName(),per1.getYear(),per1.checkMask());
		System.out.printf("name:%1$s\tyear:%2$s\tmask:%3$s",per2.getName(),per2.getYear(),per2.checkMask());
	}
}
