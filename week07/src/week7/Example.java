package week7;
import java.util.*;
public class Example {
	public static void main(String[]args) {
		int[] arr= new int[] {3,7,9,3,6};
		int[] ref=arr;
		for(int value:arr)
			System.out.print(value+"\t");
		
		ref[2]= 90;
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t"+arr.length);
		String[] word= {"sky", "car","name"};
		String[] mean= {"하늘","자동차","이름"};
		
		String q=args[0];
		
		for(int i=0;i<word.length;i++) {
			if(q.equals(word[i])) {
				System.out.println(mean[i]);
				break;
			}
		}
			
		
	}

}
