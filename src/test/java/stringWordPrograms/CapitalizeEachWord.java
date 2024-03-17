package stringWordPrograms;

public class CapitalizeEachWord {
	public static void main(String[] args) {
		String str ="a red seed"; //A Red Seed
		String word="";
		String ns="";
		str+=" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				char first = word.charAt(0);
				first = Character.toUpperCase(first);
				ns=ns+first+word.substring(1)+" ";
				word="";
			}
		}
		System.out.println(ns);
	}
}
