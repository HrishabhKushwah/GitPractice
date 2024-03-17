package stringWordPrograms;

public class NumberOfWords {
	public static void main(String[] args) {
		String str = "A Red Seed ok";
		String word = "";
		int count = 0;
		str += " ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
					count++;
					word="";
			}
		}
		System.out.println("Number of words:"+count);
	}
}