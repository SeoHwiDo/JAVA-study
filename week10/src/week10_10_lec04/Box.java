package week10_10_lec04;

public class Box{
    int garo;
    int sero;
    int high;//핃드구성 : 가로(int), 세로(int), 높이(int)
    Box(){
    	this(0,0,0);
    	
    }
    Box(int garo,int sero,int high){
    	this.garo=garo;
    	this.sero=sero;
    	this.high=high;//생성자 : 매개변수로 받은 값(가로, 세로, 높이)을  필드로 초기화
    }
    void volume() {
    	System.out.print(garo*sero*high);//volume() 메소드 : 부피를 계산하여 출력, 매개변수와 반환 값 없음
    }
}


