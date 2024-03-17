package stringWordPrograms;

public class FirstTwoCharFromWord {
	public static void main(String[] args) {
		String str = "My Name Isa Hrishabh Kushwah";
		String word = "";
		str+=" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				System.out.println(word.substring(0, 2));
				word = "";
			}
		}
	}
}