package javaprogramdemo;


public class MaxMinAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {5,10,15,20,25};
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		int sum=0;
		for(int number:numbers) {
			sum+=number;
			}
		double avg=(double)sum/numbers.length;
		System.out.println("max is"+max);
		System.out.println("min is"+min);
		System.out.println("sum is"+sum);
		System.out.println("avg is"+avg);

	}

}
