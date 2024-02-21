package javaprogramdemo;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17,flag =0;
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				break;
				
			}
				
		}
		if(flag==0) {
			System.out.println(num+"is a prime num");
		}
		else {
			System.out.println(num+"is a not prime num");
		}

	}

}
