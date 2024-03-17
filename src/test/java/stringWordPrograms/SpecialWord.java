package stringWordPrograms;

//special words are words who start and end with same characters
//e.g Anna, Bob

public class SpecialWord {
	public static void main(String[] args) {
		String str="MOM OR DAD";
		String word="";
		str += " ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				char fchar = word.charAt(0);
				char lchar = word.charAt(word.length()-1);
				//if(Character.toUpperCase(lchar)==Character.toUpperCase(fchar));
				if(lchar==fchar)
				System.out.println(word);  
				word="";
			}
		}
	}
}
