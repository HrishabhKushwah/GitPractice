package stringWordPrograms;

public class ChangeRedToBlue {
	public static void main(String[] args) {
		String str = "A Red Seed";
		String word="";
		String ns="";
		str+=" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				if(word.equals("Red")) 
					ns = ns+"blue"+" ";
				else 
					ns= ns+word+" ";
					word="";
			}
		}
		System.out.println(ns);
	}
}
