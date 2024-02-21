package javaprogramdemo;

public class ArmstrongCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int originNum=num;
		int sum=0;
		while(num!=0) {
			int digit =num%10;
			sum+=Math.pow(digit,3);
			num/=10;
		}
		boolean isArmstrong=sum==originNum;
		System.out.println(originNum+" is Armsitrong?"+isArmstrong);
	}

}
