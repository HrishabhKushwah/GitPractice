package stringCharPrograms;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s1 = "my name is hrishabh kushwah";
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(!Character.isWhitespace(ch)) {
				s2 = s2+ch;
			}
		}
		System.out.println(s2);
	}
}
