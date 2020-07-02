package week4;

public class If {
public static void main(String[]args) {
	String x="ch";
	if('c'>='a'&&'c'<='z'&&'h'>='a'&&'h'<='z'){
		{
			if('C'>='a'&&'c'<='z'&&'h'>='a'&&'h'<='z'){
				System.out.print("소문자");
			}else {
				System.out.print("소문자 아닙니다");
			}
			double gpa = 3.5;
			if ( gpa >= 4.0 ) {
				System.out.println("우등졸업.");
				System.out.println("졸업상품증정.");
			}else {
				System.out.println( "성적이 4.0 미만");
			}
			
			char type = 'm';
			if (type == 'm')
				System.out.println("남자입니다.");
				else if (type == 'w')
				System.out.println("여자입니다.");
			int a = 11;
			if ( a%2==0 )
				System.out.println("a는 짝수이다.");
				else 
				System.out.println("a는 홀수이다.");
			int count = 0;
			if ( count >0&&count<0 )
				System.out.println("count는 0이 아닙니다.");
				else
				System.out.println("count는 0입니다."); 
	
			float grade = 4.5f;
			switch((int) grade ){
				case (int)4.5:
					System.out.println("만점");
					break;
				case (int) 0.0:
					System.out.println("영점");
					break;
				default:
					System.out.println(grade);
				   
			}

}
}
}
}