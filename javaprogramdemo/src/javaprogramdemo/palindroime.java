package javaprogramdemo;

public class palindroime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,rev,num=123 ,check=0;
		int n=num;
		while(num>0)
		{
			rev=num%10;
			check=(check*10)+rev;
			num=num/10;
			
		}
		if(n==check) {
			System.out.println(n+"is a palindrom");
		} else {
			System.out.println("is not palindrome");
		}

	}

}
