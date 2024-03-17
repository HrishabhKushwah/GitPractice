package stringCharPrograms;

public class MoveLetterByTwo {
	public static void main(String[] args) {
		String s1 = "SIMPLY";
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch=='Y'||ch=='Z')
				ch-=26;
			ch+=2;
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}
