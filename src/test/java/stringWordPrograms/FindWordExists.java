package stringWordPrograms;

public class FindWordExists {
	public static void main(String[] args) {
		String str="A Red Seed";
		String word="";
		int count = 0;
		str += " ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				word+=ch;
			else {
				if(word.equalsIgnoreCase("seed"))
					count++;
					word="";
			}
		}
		if(count==0)
			System.out.println("not found");
		else {
			System.out.println("found"+word);
		}
	}
}