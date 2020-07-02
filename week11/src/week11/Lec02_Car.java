package week11;

class Car {
	private int speed;
	private int mileage;
	
	public Car(int s,int m) {
		speed=s;
		mileage=m;
	}

	public void print(String str) {
		System.out.println(str+"[speed:"+speed+"\tmileage:"+mileage+"]");
	} 
	public int getSpeed() {
		return speed;
	}
	public int getMileage() {
		return mileage;
	}
	public void setSpeed(int speed) {
		if(speed>0)
			this.speed=speed;
		else
			this.speed=0;
	}
	public void setMileage(int mileage) {
			this.mileage=mileage;
	}
}

public class Lec02_Car {
	public static void main(String[]args) {
		Car c1=new Car(100,50);
		Car c2=new Car(60,60);
		c1.print("c1");
		c2.print("c2");
		c2.setMileage(90);
		c2.print("c2");
		System.out.println("c1¼Óµµ:"+c1.getSpeed());
	}
}
