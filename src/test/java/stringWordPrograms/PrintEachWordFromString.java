package stringWordPrograms;

//program to to extract words from string!!

public class PrintEachWordFromString {
	public static void main(String[] args) {
		String str = "this is a book";
		String word = "";//will store the word.
		str +=" ";//to get the last word explicitly adding space at the last.
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ') {
				word+=ch;
			}
			else {
				System.out.println(word);
				word="";
			}
		}
	}
}
