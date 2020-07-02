package week11;

class Information{
	String id;
	int pass;

	public Information(){
		this("",0);
	}
	public Information(String id,int pass){
		this.id=id;
		this.pass=pass;
	}
	public Information(String id) {
		this(id,(int)(Math.random()*9000)+1000);
	}
	public String toString() {
		return "Information[id="+id+",pass="+pass+"]";
	}
	void setPass(int pass) {
		this.pass=pass;
	}
	
}
public class Lec01_Information {
	public static void main(String[]args) {
		Information info1=new Information();
		Information info2=new Information("linux");
		Information info3=new Information("unix",5674);
		info3.id="window";
		
		System.out.println("info1:"+info1);
		System.out.println("info2:"+info2);
		System.out.println("info3:"+info3);
		
		info2.setPass(8549);
		
		System.out.println("º¯°æ ÈÄ info2:"+info2);
	}
}
