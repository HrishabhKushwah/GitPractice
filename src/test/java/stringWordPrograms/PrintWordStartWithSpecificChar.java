package stringWordPrograms;

//program to find the word start with or end with or contain a specific char.

public class PrintWordStartWithSpecificChar {
	public static void main(String[] args) {
		String str = "This is red";
		String word ="";
		str+=" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch!=' ')
				word+=ch;
			else {
				//if(word.length()==3) //checking and printing the three char words or any specific number.
				if(word.contains("i"))//checking and printing the words that contains char i or any specific char.
				//if(word.startsWith("r"))//checking and printing the words starts with r or any specific char.
				//if(word.endsWith("ed"))//checking and printing the words ends with ed or any specific char.
				System.out.println(word);
				word="";
			}
		}
	}
}
