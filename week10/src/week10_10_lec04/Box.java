package week10_10_lec04;

public class Box{
    int garo;
    int sero;
    int high;//���屸�� : ����(int), ����(int), ����(int)
    Box(){
    	this(0,0,0);
    	
    }
    Box(int garo,int sero,int high){
    	this.garo=garo;
    	this.sero=sero;
    	this.high=high;//������ : �Ű������� ���� ��(����, ����, ����)��  �ʵ�� �ʱ�ȭ
    }
    void volume() {
    	System.out.print(garo*sero*high);//volume() �޼ҵ� : ���Ǹ� ����Ͽ� ���, �Ű������� ��ȯ �� ����
    }
}


