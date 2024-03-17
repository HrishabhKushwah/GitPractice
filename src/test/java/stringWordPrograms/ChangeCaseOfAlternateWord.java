package stringWordPrograms;

public class ChangeCaseOfAlternateWord {
public static void main(String[] args) {
		String str = "A Red Seed";//A red SEED
		String word="";
		int count=0;
		String ns="";
		str+=" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				if(count++%2==0) 
					ns = ns+word.toUpperCase()+" ";
				else 
					ns = ns+word.toLowerCase()+" ";
					word="";
			}
		}
		System.out.println(ns);
	}
}