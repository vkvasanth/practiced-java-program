package javaprogramdemo;

import java.time.Year;

public class checkleapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =2024;
		boolean isLeap=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					isLeap=true;
				else 
					isLeap=false;
			}
			else 
				isLeap=true;
		}
		else {
			isLeap=false;
		}
		if(isLeap)
			System.out.println(year+"is a leap year");
		else {
			System.out.println(year+"is not a leao year");
		}

	}

}
