package javaprogramdemo;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i,f=0,s=1,r;
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println("enter a number");
//		for(i=0;i<n;i++)
//		{
//			if(i<=1)
//				r=i;
//			else
//				r=f+s;
//			f=s;
//			s=r;
//			System.out.println(r);
//		}
		for (int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				
			}
		}
		for (int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
		
		
}
}