package javaprogramdemo;

public class CountVowel {
	public static void main (String[] args) {
		String string="Hello world";
		int vowels=0, consonants=0;
		string=string.toLowerCase();
		for(char ch:string.toCharArray()) {
			if(ch >='a' && ch<='z') {
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("consonanits:"+consonants);
	}

}
