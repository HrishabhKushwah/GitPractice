package stringWordPrograms;

//program to extract fisrt char of each word

public class FirstCharOfEachWord {
	public static void main(String[] args) {
		String str = "My Name Is Hrishabh Kushwah";
		String word = "";//it will store the word.
		str+=" ";//adding extra space at the after last word.
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')//checking the spaces between words.
				word+=ch;
			else {
				System.out.print(word.charAt(0));//fetching first char of the word.
				word="";//releasing the holded word.
			}
		}
	}
}