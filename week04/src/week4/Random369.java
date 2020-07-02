package week4;

public class Random369 {
	public static void main(String[]args) {
		System.out.println("1~99사이의 정수형 난수를 생성합니다");
		int num=(int)(Math.random()*99)+1;
		int clap1=num/3;
		int	clap2=num%3;
		System.out.printf("생성된 난수는%d입니다\n",num);
		if(clap1<=3) {
			switch(clap2) {
			case 0:
				System.out.print("박수 짝");
				break;
			default:
				System.out.print("박수 없음");
				break;		
			}
		}
		else if((clap1<=13&&clap1>=10)||(clap1<=23&&clap1>=20)||(clap1<=33&&clap1>=30)) {
			switch(clap2) {
			case 0:
				System.out.print("박수 짝짝");
				break;
			default:
				System.out.print("박수 짝");
				break;		
			}
			}
		
		else if((clap1<=6&&clap1>=4)||(clap1<=16&&clap1>=14)||(clap1<=26&&clap1>=20)) {
			switch(clap2) {
			case 1:
				System.out.print("박수 짝");
				break;
			default:
				System.out.print("박수 없음");
				break;	
			}
		}
		else if((clap1<=9&&clap1>=7)||(clap1<=19&&clap1>=17)||(clap1<=29&&clap1>=27)) {
			switch(clap2) {
			case 2:
				System.out.print("박수 짝");
				break;
			default:
				System.out.print("박수 없음");
				break;	
			}
		}
	}	
}

