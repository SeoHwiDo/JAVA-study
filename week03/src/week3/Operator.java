package week3;

public class Operator {
	public static void main(String[] args) {
		int x = 0xf3a2, y = 0xb7c1, data=23;
		boolean b1 = true, b2 = false;
		String result;

//변수data에 저장된 값이 짝수인지 홀수인지 판단하여 결과를 result에 저장-조건 연산자
		result=data%2==0?"짝수":"홀수";

// x, y 에 저장된 값을 2진수로 출력
		System.out.println(" x= " + Integer.toBinaryString(x));	
	 System.out.println(" y= " + Integer.toBinaryString(y)); 

            // 비트 연산 결과 2진수로 출력
	System.out.println("1: x & y = " + Integer.toBinaryString(x & y));		       System.out.println("2: x | y = " + Integer.toBinaryString(x | y));
		System.out.println("3: ~x = " + Integer.toBinaryString(~x));

// 논리 연산 결과 출력
		System.out.println("4: b1 & b2 = " + (b1 & b2));
		System.out.println("5: b1 && b2 = " + (b1 && b2));
		System.out.println("6: b1 || b2 = " + (b1 || b2));
		System.out.println("7: b1 ^ b2 = " + (b1 ^ b2));

// 조건 연산 결과 출력
		System.out.println("8:  data%2==0?\"짝수\":\"음수\" => " + result);
	}
}