package week10_10_lec06;

public class Info {
	String id;
	int pass;
	Info(){
		this("");
	}
	Info(String id){
		this.id=id;
		this.pass=(int)(Math.random()*9999);
	}
	void disPlay() {
		System.out.printf("id:%s	password:%04d",id,pass);
	}
}
