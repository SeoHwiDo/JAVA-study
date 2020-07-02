package week11;

class Box{
	private int width,length,height;
	private int vol;
	
	Box(int w,int l,int h){
		width=w;
		length=l;
		height=h;
		vol=width*length*height;
	}
	public int getVol() {
		return vol;
	}
}
class BoxComp{
	public static boolean isSameBox(Box b_1,Box b_2) {
		if(b_1.getVol()==b_2.getVol())
			return true;
		else
			return false;
	}
}
public class Lec03_Box {
	public static void main(String[]args) {
		Box box1=new Box(10,50,20);
		Box box2=new Box(10,30,50);
		System.out.println("box1.vol==box2.vol:"+BoxComp.isSameBox(box1, box2));
	}
}
