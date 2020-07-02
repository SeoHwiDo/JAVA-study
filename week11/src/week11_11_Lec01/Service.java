package week11_11_Lec01;

class Service {
	final private String id="hallym";
	final private int pass=3456;
	
	public String getId() {
		return id;
	}
	public int getPass() {
		return pass;
	}
	
	public static boolean login(String id,int pass) {
		Service ser = new Service();
		if(id.equals(ser.getId())&&pass==ser.getPass())
			return true;
		else
			return false;
	}
	public static void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다");
	}
}
