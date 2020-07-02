package week10_10_lec01;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car();
		car.speed = 40;
		car.color = "blue";
		System.out.println("color=" + car.color);
		System.out.println("speed(�ʱⰪ)=" + car.speed);
		car.speedUp(70);
		System.out.println("speed(+70)=" + car.speed);
		car.speedDown(10);
		System.out.println("speed(-10)=" + car.speed);
	}

}
