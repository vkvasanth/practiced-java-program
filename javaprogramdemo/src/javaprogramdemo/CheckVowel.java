package javaprogramdemo;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch='a';
			boolean isVowel=false;
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				isVowel=true;
				
			}
			if (isVowel) {
				System.out.println(ch+"is a vowel");
			} else {
				System.out.println(ch+"is a consonant");
			}
	}

}
