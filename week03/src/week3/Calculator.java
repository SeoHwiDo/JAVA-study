package week3;

public class Calculator {
	public static void main(String[]args) {
		int a =1;
		int	b =5;
		int c =10;
		int d =1;
		int isum;
		double dsum;
		isum= a++;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//1
		isum= ++a;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//2
		isum= ++a + --c;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//3
		isum= --c - b--;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//4
		isum=c /= --b;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//5
		isum= a += ++c + b;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//6
		isum= c++ % b;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//7
		isum= ++c / ++a;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+isum);//8
		dsum= (double) c / b;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+dsum);//9
		dsum= (double) c/++a;
		System.out.println((d++)+"\t"+("a="+a+"\t"+"b="+b+"\t"+"c="+c)+"\t"+dsum);//10
	}

	}


