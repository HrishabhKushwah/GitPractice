package stringWordPrograms;

public class FindLongestWord {
	public static void main(String[] args) {
		String str = "my name is hrishabh kushwah";// Seed
		String word = "";
		String longword = "";
		String shortword = "";
		str += " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word += ch;
			} else {
				if (word.length() > longword.length()) {
					longword = word;
				}
				if(shortword.isEmpty() ||word.length()<shortword.length()) {
					shortword = word;
				}
				else if ((word.length()==shortword.length())) {
					shortword+=","+word;
				}
				word = "";
			}
		}
		System.out.println("Long word is: "+longword);
		System.out.print("Short word is: "+shortword);
	}
}

//Long word is: hrishabh
//Short word is: my,is