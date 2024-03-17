package stringWordPrograms;

public class SwapLastLetterWithFirst {
	public static void main(String[] args) {
		String str = "In the box"; //nI eht xob
		String word = "";
		str+=" ";//will add space after lst word.
		String ns="";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				char first = word.charAt(0);//it will give first char.
				char last = word.charAt(word.length()-1);//it will give last char.
				String middle = word.substring(1, word.length()-1);
				word="";
				ns = ns+last+middle+first+" ";
			}
		}
		System.out.println(ns);
	}
}