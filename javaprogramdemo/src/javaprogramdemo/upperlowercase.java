package javaprogramdemo;

public class upperlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vasanth Kumar 3000";
		int upper=0,lower=0,number=0,special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				upper++;
			else if (ch>='a' && ch<='b')
			 lower++;
			else if (ch>= '0'&& ch<='9')
				number++;
			else
		
special++;
			}
		System.out.println("lower case letters"+upper);
		System.out.println("lower case letters"+lower);
		System.out.println("lower case letters"+number);
		System.out.println("lower case letters"+special);

	}

}
